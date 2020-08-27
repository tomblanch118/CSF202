import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a very simple Cash Register to which {@link Item} can be added. The
 * total can be calculated and the transaction completed by providind enough money
 * to cover the cost of all items in the Cash Register.
 */
public class CashRegister{
    private List<Item> items = new ArrayList<>();

    /**
     * Adds one instance of the provided item to the register.
     * @param item The item to be added.
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Adds multiple items to the register.
     * @param item The item to be added.
     * @param quantity The number of the item to be added.
     */
    public void addItem(Item item, int quantity) {

        //Ooo look we can omit parts of a for loop :)
        for(; quantity >0; quantity--) {
            items.add(item);
        }
    }


    /**
     * Removes the given item from the register.
     * @param item The item to be removed.
     */
    public void removeItem(Item item) {
        items.remove(item);
    }

    /**
     * Calculates the total cost of all items in the register.
     * @return The total cost of all items in the register.
     */
    public double getSubtotal(){
        
        /*Java 8 added streams and lambdas and all sorts of cool stuff. If this
         * looks a bit intimidating you could definetly do it a different way. eg:
         * double total = 0;
         * for(Item item : items) {
         *    total = total + item.getPrice();
         * }
         */
        double total = items
            .stream()
            .mapToDouble(item -> item.getPrice())
            .sum();
       
        return total;
    }

    /**
     * Clears the register of all items effectively resetting it for the next customer
    */
    public void clearAllItems() {
        items.clear();
    }

    /**
     * Completes a transaction and prepares the regiester for a new customer.
     * @param money The money given by the customer to pay for the items in the register.
     * @return The change to be given to the customer.
     * @throws RuntimeException If not enough money was given to pay for the goods!
     */
    public double  completeTransaction( double money ) {
        
        //If the money provided doesn't cover the cost, throw an exception.
        if(money < getSubtotal()) {
            throw new RuntimeException("Oi! You haven't given me enough money!");
        }

        double change = (money - getSubtotal());
        System.out.println(String.format("Thank you. Your change is £%.02f",change ));

        clearAllItems();
        return change;
    }

    /** 
     * Returns a String representation of this class.
    */
    @Override
    public String toString() {
        String returnString = "CashRegister containing "+items.size() + " items: \n";
    
        // Again using streams and lambdas because they are cool. You could just do:
        /*
         * for(Item item: items) {
         *     returnString += item.toString()+"\n";
         * }
         */
        returnString += items.stream()
            .map(item -> item.toString())
            .collect(Collectors.joining("\n"));
        return returnString;
    }

    /**
     * Tests out our register and item classes.
     */
    public static void main(String[] args) {
        Item cheese = new Item("Cheese", 2.49);
        Item ham = new Item("Sliced Ham", 1.75);

        CashRegister register = new CashRegister();

        register.addItem(cheese);
        register.addItem(ham, 5);

        System.out.println(register);
        System.out.println(register.getSubtotal());
        register.removeItem(ham);
        System.out.println(register.getSubtotal());
        register.completeTransaction(10.00);
    }
}
