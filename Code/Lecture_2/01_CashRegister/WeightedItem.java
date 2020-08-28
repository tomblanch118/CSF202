/** Represents an item that is sold by weight. Each WeightedItem
 * Has a name, weight in kilograms and a price in pounds per kilogram.
 */
public class WeightedItem extends Item {

    private double weight;

    public WeightedItem(String name, double pricePerKg, double weight) {
        super(name, pricePerKg);
        this.weight = weight;
    }

    /**
     * Returns the price of this item based on the weight and price per kilogram.
     * @return The price.
    */
    @Override
    public double getPrice() {
        return weight * super.getPrice(); 
    }

    @Override
    public String toString() {
        return String.format("%.02f KG of %s (%05d), £%.02f ", weight, 
                getName(), getUniqueID(), getPrice());
    }
}
