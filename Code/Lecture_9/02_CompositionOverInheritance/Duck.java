public class Duck{
    
    //This isn't a great design... have a think about how to improve it.
    private FlyingBehaviour behaviour;

    public Duck(){
        this.behaviour = new FlyingBehaviour();
    }

    public void move() {
        behaviour.move();
    }
}
