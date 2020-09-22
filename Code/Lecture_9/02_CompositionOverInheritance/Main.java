public class Main {

    public static void main(String[] args) {
        
        //Composed duck 
        Duck duck = new Duck();

        duck.move();


        //Inheritance duclk
        inheritanceDucks.Duck duck2 = new inheritanceDucks.FlyingDuck();

        duck2.move();
    }
}
