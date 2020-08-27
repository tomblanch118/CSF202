/**
 * Represents a very simple item with a name and a price.
 * */
public class Item {

    private String name;
    private double price;

    /**
     * @param name The name of the item.
     * @param price The price of the item.
     * */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
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


    @Override
    public String toString() {
        return String.format("%s, £%.02f", name, price);
    }
}
