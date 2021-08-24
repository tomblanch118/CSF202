import java.util.ArrayList;
import java.util.List;

public class GenericsTest{

    public GenericsTest(){
    }
   

   /**
    * YOU REALLY DON'T NEED TO KNOW ABOUT THIS STUFF FOR THE MODULE 
    * BUT IT IS COOL AND INTERESTING. PLEASE DON'T READ THIS AND EXPECT
    * TO UNDERSTAND IT ALL!
    */  
    public static void main(String[] args) {
      
        //This should definitely work
        ArrayList<Object> listOfObjects = new ArrayList<Object>();
       
        /*"Incompatible Types?!" Does this mean that an ArrayList of strings is NOT
         * a subtype of an ArrayList of Objects?! But String is a subclass of Object!
         */
        ArrayList<Object> borkedListOfObjects = new ArrayList<String>();
        
        //But it works with arrays!
        Object[] arrayOfObjects = new String[10];

        //Oh look we can make this work if we specify what we actually wanted from our
        //generic parameter.
        ArrayList<? extends Object> workingAgain = new ArrayList<String>();
        
        //Inheritance in our generic parameter and using the List interface... mind. blown.
        List<? extends Object> workingAgainWithInterface = new ArrayList<String>();


    }
}
