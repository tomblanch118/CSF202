public class RubberDuck extends Duck{

	@Override
	public void quack()
	{
		System.out.println("Quack: Squeeeeek");
	}

	@Override
	public void fly()
	{
		System.out.println("Fly: I CANNOT FLY");
	}
	public void display()
	{
		System.out.println("Display: I look like a majestic yellow plastic duck.");
	}
}
