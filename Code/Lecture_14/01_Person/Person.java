import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person{

    private String firstName;
    private String secondName;
    private int age;

    public Person(String firstName, String secondName, int age){
        Objects.requireNonNull(firstName, "First Name must not be null");        
        Objects.requireNonNull(secondName, "Second Name must not be null");        
        
        if(age<18){
            throw new InvalidParameterException("Age must be greater than 18");
        }

        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Person(String fullName, int age){
        Objects.requireNonNull(fullName, "Fullname cannot be null");
        String[] parts = fullName.split("\\ ");

        if(parts.length < 2){
            throw new InvalidParameterException("Fullname is invalid");
        }

        if(age<18){
            throw new InvalidParameterException("Age must be greater than 18");
        }


        this.firstName = parts[0];
        this.secondName = parts[parts.length-1];
        this.age = age;
         
    }

    public Person(String firstName, String secondName, LocalDate dateOfBirth) {
        LocalDate today = LocalDate.now();

        int age = Period.between(dateOfBirth, today).getYears();
        
        Objects.requireNonNull(firstName, "First Name must not be null");        
        Objects.requireNonNull(secondName, "Second Name must not be null");        
        
        if(age<18){
            throw new InvalidParameterException("Age must be greater than 18");
        }

        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;

    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the secondName
     */
    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return firstName+" "+secondName+"("+age+")";
    }
}
