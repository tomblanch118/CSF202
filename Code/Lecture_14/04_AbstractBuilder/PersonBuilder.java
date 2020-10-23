import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public abstract class PersonBuilder{

    public PersonBuilder(){
    }

    public abstract void setFirstName(String firstName);

    public abstract void setSecondName(String secondName);

    public abstract void setAge(int age);

    public abstract void setDateOfBirth(LocalDate date);

    public abstract void setFullName(String fullName);

}
