import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;


public class PersonParser{

    private String filename;
    private PersonBuilder builder;

    public PersonParser(String filename, PersonBuilder builder) {
        this.filename = filename;
        this.builder = builder;
    }

    public Collection<Person> parse() throws IOException{
        
        Collection<Person> people = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line = br.readLine();
                
            while(line != null){
                
                String[] tokens = line.split(",");
                
                for(String token: tokens){
                    String[] components = token.split(":");
                    
                    switch(components[0])
                    {
                        case "SN":
                            builder.setSecondName(components[1]);
                            break;
                        case "FN":
                            builder.setFirstName(components[1]);
                            break;
                        case "N":
                            builder.setFullName(components[1]);
                            break;
                        case "DOB":
                            LocalDate dob = LocalDate.parse(components[1], DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                            builder.setDateOfBirth(dob);
                            break;
                        case "A":
                            builder.setAge(Integer.parseInt(components[1]));
                            break;
                        default:
                            throw new RuntimeException("Parse Error...");
                    }
                }
                    
                Person person = builder.build();
                people.add(person);

                line = br.readLine();
            }
        }
        return people;
    }
}
