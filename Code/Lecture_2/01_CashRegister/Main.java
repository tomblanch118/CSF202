public class Main {

  public static void main(String... args) {
    Item ham = new Item("Ham", 4.31); 
    Item cheese = new WeightedItem("Cheese", 5.50, 10.0);
    

    System.out.println(ham.getPrice());
    System.out.println(cheese.getPrice());
    //useItem(cheese);
  }

  private static void useItem(Item item) {
    System.out.println("The item is: "+item.getName()+", costs: "+item.getPrice()); 
  }
}
