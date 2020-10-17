public class LazySingleton{

    private static LazySingleton instance;
    
    private LazySingleton(){
        System.out.println("LazySingleton Constructor");

        /*try{
            Thread.sleep(2000);
        } catch(InterruptedException e){

        }*/
    }

    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
    
    public static String doThing(int i, String s) {
        String tmp = "";

        for(;i >0; i--){
            tmp += s;
        }
        return tmp;
    }
}



