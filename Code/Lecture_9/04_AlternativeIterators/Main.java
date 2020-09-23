import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main{
    private static List<String> someStrings = new ArrayList<>();
    private static Set<String> someOtherStrings = new TreeSet<>(); 

    public static void main(String[] args){

        addItemsToDataStructurs();

        // We can iterator through anything that can provide us with an iterator
        System.out.println("-----Simple Iterator through array list------");
        methodThatNeedsToLoopThroughElements(someStrings.iterator());
        System.out.println("-----Simple Iterator through tree set------");
        methodThatNeedsToLoopThroughElements(someOtherStrings.iterator());
        
        //We can change the way that we iterate without changing the client code.
        //Here we make an iterator that filters elements based on some predciate
        //This example iterates through all elements whose length is greater than 3  
        System.out.println("-----FilteringIterator through array list------");
        FilteringIterator<String> it2 = new FilteringIterator<String>(someStrings, (String s) -> s.length() > 3);
        methodThatNeedsToLoopThroughElements(it2);
        
        System.out.println("-----FilteringIterator through tree set------");
        FilteringIterator<String> it3 = new FilteringIterator<String>(someOtherStrings, (String s) -> s.length() > 3);
        methodThatNeedsToLoopThroughElements(it3);
       
    }



    public static void methodThatNeedsToLoopThroughElements(Iterator<String> iterator){
         while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    public static void addItemsToDataStructurs(){
        someStrings.add("Hello");
        someStrings.add("my");
        someStrings.add("name");
        someStrings.add("is");
        someStrings.add("Tom");
        someStrings.add("!");
        someOtherStrings.add("Hello");
        someOtherStrings.add("my");
        someOtherStrings.add("name");
        someOtherStrings.add("is");
        someOtherStrings.add("Tom");
        someOtherStrings.add("!");
    }


}
