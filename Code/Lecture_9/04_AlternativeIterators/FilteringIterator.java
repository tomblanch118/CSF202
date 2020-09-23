import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

/**
 * Fairly simple version of a filtering iterator that takes
 * a predicate and iterates through elements that test positive
 * by the this predicate.
 *
 * Inspiration taken from the apache commons version 
 * org.apache.commons.collections4.iterators.FilterIterator.java
 */
public class FilteringIterator<E> implements Iterator<E>{

    private Iterator<E> iterator;
    private Predicate<E> predicate; 
    private E nextObj; 
    private boolean nextObjSet;

    public FilteringIterator(Iterable<E> iterable, Predicate<E> predicate){
        this.iterator = iterable.iterator();
        this.predicate = predicate;
        this.nextObjSet = false;
    }

    @Override
    public boolean hasNext() {
        return nextObjSet || setNextObject();        
    }
    
    public boolean setNextObject() {
        while(iterator.hasNext()) {
            final E temp = iterator.next();
            if(predicate.test(temp)) {
                nextObj = temp;
                nextObjSet = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public E next() {
        if(!nextObjSet && ! setNextObject()) {
            throw new NoSuchElementException();
        }
        nextObjSet = false;
        return nextObj;
    }
}
