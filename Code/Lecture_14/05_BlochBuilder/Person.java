import java.security.InvalidParameterException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person{

    private final String firstName;
    private final String secondName;
    private final int age;

    private final String email;
    private final String phoneNumber;
    private final String postCode;

    private Person(Builder builder){
            
        Objects.requireNonNull(builder.firstName, "First Name cannot be null.");
        Objects.requireNonNull(builder.secondName, "Second Name cannot be null.");
        if(builder.age < 18) {
            throw new IllegalArgumentException("Age must be 18 or greater.");
        }
        firstName = builder.firstName;
        secondName = builder.secondName;
        age = builder.age;

        email = builder.email;
        phoneNumber = builder.phoneNumber;
        postCode = builder.postCode;
    }

    public static class Builder{
        private String firstName;
        private String secondName;
        private int age;
        
        private String email; 
        private String phoneNumber;
        private String postCode;

        public Builder(String firstName, String secondName, int age){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
        }

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder livesIn(String postCode) {
            this.postCode = postCode;
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return the postCode
     */
    public String getPostCode() {
        return postCode;
    }

    @Override
    public String toString() {
        String str =  firstName+" "+secondName+"("+age+")"+
                    (phoneNumber!=null?", "+phoneNumber:"")+
                    (email!=null?", "+email:"")+
                    (postCode!=null?", "+postCode:"");

        return str;
    }

}
