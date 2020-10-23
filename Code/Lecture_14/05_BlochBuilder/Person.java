import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person{

    private String firstName;
    private String secondName;
    private int age;
    private String email;

    private Person(Builder builder){
            
        Objects.requireNonNull(builder.firstName, "First Name cannot be null.");
        Objects.requireNonNull(builder.secondName, "Second Name cannot be null.");
        if(builder.age < 18) {
            throw new IllegalArgumentException("Age must be 18 or greater.");
        }
        firstName = builder.firstName;
        secondName = builder.secondName;
        age = builder.age;
    }

    public static class Builder{
        private String firstName;
        private String secondName;
        private int age;
        
        private String email; 

        public Builder(String firstName, String secondName, int age){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    };

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
