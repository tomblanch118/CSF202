import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;

public class Main{

    public static void main(String[] args){
        PersonObjectBuilder personBuilder = new PersonObjectBuilder();
        PersonHTMLBuilder htmlBuilder = new PersonHTMLBuilder();
        PersonParser parser = new PersonParser("people.txt", htmlBuilder);

        try{
            while(parser.parse()){
                String p = htmlBuilder.build();
                System.out.println(p);
            }
        } catch(IOException e) {
            System.err.println("Error parsing file...");
        }
    }

}
