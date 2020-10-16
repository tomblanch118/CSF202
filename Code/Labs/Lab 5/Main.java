import java.util.Collection;
import java.util.ArrayList;

public class Main{

	private Collection<Duck> myDucks = new ArrayList<Duck>();

	public void makeSomeDucks()
	{
		// Make some different ducks
		Duck mallardDuck = new MallardDuck();
		Duck redDuck = new RedheadDuck();
		Duck rubberDuck = new RubberDuck();

		myDucks.add(mallardDuck);
		myDucks.add(rubberDuck);
		myDucks.add(redDuck);

		
		for(Duck d : myDucks)
		{
			d.display();
			d.fly();
		}

	}

	// --------------- Ignore below this ----------------
	public static void main(String[] args)
	{
		Main main = new Main();
		main.makeSomeDucks();
	}
}
