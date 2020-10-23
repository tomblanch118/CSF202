import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person{

    private String firstName;
    private String secondName;
    private int age;

    public Person(String firstName, String secondName, int age){
            
        Objects.requireNonNull(firstName, "First Name cannot be null.");
        Objects.requireNonNull(secondName, "Second Name cannot be null.");
        if(age < 18) {
            throw new IllegalArgumentException("Age must be 18 or greater.");
        }
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
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
