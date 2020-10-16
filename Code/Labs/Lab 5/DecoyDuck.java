public class DecoyDuck extends Duck{

	@Override
	public void fly()
	{
		System.out.println("Fly: CANNOT FLY");
	}

	@Override
	public void quack()
	{
		System.out.println("Quack: I CANNOT QUACK");
	}

	public void display()
	{
		System.out.println("Display: I only look like a duck!");
	}
}
