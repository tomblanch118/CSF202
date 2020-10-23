import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class PersonBuilder{

    private String firstName;
    private String secondName;
    private int age;

    public PersonBuilder(){
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dob){
        LocalDate today = LocalDate.now();
        this.age = Period.between(dob, today).getYears();
    }

    public void setFullName(String fullName) {
        String[] parts = fullName.split("\\ ");
        
        if(parts.length == 1){
            this.firstName = parts[0];
        }
        if(parts.length >= 2){
            this.firstName = parts[0];
            this.secondName = parts[parts.length -1 ];
        }
    }

    public Person build() {
        return new Person(firstName, secondName, age);
    }
}
