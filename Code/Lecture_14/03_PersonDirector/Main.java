import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;

public class Main{

    public static void main(String[] args){
        PersonParser parser = new PersonParser("people.txt", new PersonBuilder());

        try{
            Collection<Person> people = parser.parse();

            for(Person p: people) {
                System.out.println(p);
            }
        } catch(IOException e) {
            System.err.println("Error parsing file...");
        }
    }

}
