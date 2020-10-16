import java.util.List;
import java.util.ArrayList;

public class Box<E>{
    
    private List<E> itemsInBox = new ArrayList<E>();
   
    public BoxIterator<E> createIterator() {
       return new BoxIterator<E>(this); 
    }

    public List<E> getItems() {
        return itemsInBox;
    }

    public void addItem(E item){
        itemsInBox.add(item);
    }
    
}
