import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;


public class PersonParser{

    private PersonBuilder builder;
    private BufferedReader br;

    public PersonParser(String filename, PersonBuilder builder) {
        this.builder = builder;
        try{
        this.br = new BufferedReader(new FileReader(filename));
        } catch(FileNotFoundException e){
            System.err.println("Can't find the file");
        }
               
    }


    public boolean parse() throws IOException{
        String line = br.readLine();
        if(line == null){
            br.close();
            return false;
        }
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

        return true;
    }
}
