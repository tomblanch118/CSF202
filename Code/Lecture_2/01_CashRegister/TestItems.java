public class TestItems {
    
    public static void main(String[] args) {
        Item i1 = new Item("Fancy Cheese", 4.32);
        Item i2 = new Item("Sliced Ham", 1.99);
        Item i3 = i1;
       
       System.out.println(i3.getPrice()); 
    }
}
