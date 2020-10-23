import java.time.LocalDate;

public class Main{

    public static void main(String[] args){
        PersonBuilder builder = new PersonBuilder();
        builder.setDateOfBirth(LocalDate.of(1906, 12, 9));
        builder.setFullName("Grace Brewster Murray Hopper");

        Person grace = builder.build();
        System.out.println(grace);
    }

}
