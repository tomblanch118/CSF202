public class BoxIterator<E> implements Iterator<E>{

    private Box<E> box;
    private int idx;

    public BoxIterator(Box<E> box) {
        this.box = box;
        this.idx = 0;
    }

    @Override
    public E nextItem(){
        return box.getItems().get(idx++);
    }

    @Override
    public boolean hasNext() {
        if(box.getItems().size() <= idx) {
            return false;
        }
        return true;
    }  
}
