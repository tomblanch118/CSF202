
public class Main {

	public static void main(String[] args) {
		Item i1 = new Item("Hario Starmix", 1.50);
		Item i2 = new Item("Cake", 0.99);
		
		Basket b = new Basket();
		System.out.println("Adding item");
		b.addItem(i1);
		System.out.println("Adding item");
		b.addItem(i2);
		System.out.printf("Basket total is %.2f\n", b.getTotalPrice());
		System.out.println("Changing item price");
		i2.setPrice(10.00);
		System.out.printf("Basket total is %.2f\n", b.getTotalPrice());
	}
	
}
