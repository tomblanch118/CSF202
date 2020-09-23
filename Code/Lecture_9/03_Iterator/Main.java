import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main{

    public static void main(String[] args){
        List<String> someStrings = new ArrayList<>();
        Set<String> someOtherStrings = new TreeSet<>(); 

        ArrayList<String> test = new ArrayList<>();
        
        /*Trees/Sets/Lists are all fundamenatally different data structures but
         *the iterator pattern lets us treat them similarly by providing
         *a generic way to traverse them.
         */
        
        /*Uncomment one or the other. It doesn't matter which data structure we 
         *are using they are traversed in the same way!
         */
        //Iterator<String> it = someOtherStrings.iterator();
        Iterator<String> it = someStrings.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
