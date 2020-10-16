public class Main{

    public static void main(String[] args){
        Box<String> stringBox = new Box<String>();


        stringBox.addItem("This"); 
        stringBox.addItem("is"); 
        stringBox.addItem("a"); 
        stringBox.addItem("Test!"); 

        Iterator<String> iterator = stringBox.createIterator();

        while(iterator.hasNext()){
            System.out.println("*"+iterator.nextItem());
        }
    }

}
