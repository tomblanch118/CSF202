public class Main{

    public static void main(String[] args){
        System.out.println("First");
        System.out.println("LazySingleton: "+LazySingleton.doThing(5,"tom"));

        System.out.println("Second");
        System.out.println("EagerSingleton:"+EagerSingleton.doThing(5,"tim"));
       
        System.out.println("Three");
        LazySingleton s = LazySingleton.getInstance();

        System.out.println("Four");
        EagerSingleton theInstance2 = EagerSingleton.getInstance();
    
    }
}
