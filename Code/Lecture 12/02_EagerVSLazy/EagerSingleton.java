public class EagerSingleton{
    
    private static final EagerSingleton INSTANCE = new EagerSingleton(); 
    private EagerSingleton(){
        System.out.println("EagerSingleton Constructor");
        
        /*try{
            Thread.sleep(2000);
        }catch(InterruptedException e){

        }*/
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public static String doThing(int i, String s) {
        String tmp = "";

        for(;i >0; i--){
            tmp += s;
        }
        return tmp;
    }
}
