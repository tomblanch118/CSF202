import java.time.LocalDate;

public class Main{

    public static void main(String[] args) {
        Person tom = new Person("Tom","Blanchard", 32);
        System.out.println(tom);

        Person alan = new Person("Alan Mathison Turing", 27);
        System.out.println(alan);

        Person ada = new Person("Ada", "Lovelace", LocalDate.of(1815, 12, 10) );
        System.out.println(ada);
    }


    public Main(){
    }

}
