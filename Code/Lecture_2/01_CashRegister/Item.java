/**
 * Represents a very simple item with a name and a price.
 * */
public class Item implements Comparable<Item>{

    private String name;
    private double price;
    private int uniqueID;
    private static int lastAssignedID = 0;

    /**
     * @param name The name of the item.
     * @param price The price of the item.
     * */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.uniqueID = lastAssignedID;
        lastAssignedID += 1;
    }

    /**
     * Returns the name of this item.
     * @return The name of this item.
     * */
    public String getName() {
        return name;
    }

    /**
     * Returns the price of this item.
     * @return The price of this item.
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Returns the uniqueID of this item.
     * @return the uniqueID
     */
    public int getUniqueID() {
        return uniqueID;
    }

    @Override
    public String toString() {
        return String.format("%s (%05d), £%.02f", name, uniqueID, price);
    }

    /**
     * Compares two items against each other using their names.
     * @param otherItem The item to compare against this item.
     * @return The ordering based on their names. See compareTo in {@link String} for details. 
     */
    public int compareTo(Item otherItem) {
        if( otherItem == null ) {
            throw new NullPointerException("Tried to compare an Item to null.");
        }
        
        return name.compareTo(otherItem.getName());
    }
}
