public class Main{

    public static void main(String[] args) {
        Person p = new Person.Builder("Tom", "Blanchard", 32)
            .withEmail("t.j.blanchard@swansea.ac.uk")
            .phoneNumber("0123456789")i
            .livesIn("SA2 123")
            .build();
    
        System.out.println(p);


    }
    public Main(){
    }

}
