import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;
import java.time.Period;

public class PersonHTMLBuilder extends PersonBuilder{

    private String firstName;
    private List<String> middleNames = new ArrayList<>();
    private String secondName;
    private int age;
    private LocalDate dob;

    public PersonHTMLBuilder(){
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
        this.dob = dob;
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
            for(int i=1; i<parts.length-1;i++){
                middleNames.add(parts[i]);
            }
        }
    }

    public String build() {
        String output = String.format("<hr>\n<h1>%s %s</h1>\n", firstName, secondName);
        if(middleNames.size()!=0){
            output += "\t<div>Middle Names\n\t\t<ul>\n";    
            for(String name: middleNames){
                output += String.format("\t\t\t<li>%s</li>\n",name);
            }
            output += "\t\t</ul>\n\t</div>\n";
        }
        output += "\t<div>\n";
        output += String.format("\t\t<span style=\"color:red;\">Age %d</span>",age);
        if(dob != null){
            output += String.format(" => (Date of Birth: %s)", dob.toString());
        }
        output += "\n\t</div>";

        
        firstName = "";
        secondName = "";
        middleNames.clear();
        dob = null;
        return output;
    }

}
