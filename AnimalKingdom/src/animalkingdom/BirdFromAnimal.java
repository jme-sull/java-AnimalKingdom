package animalkingdom;

public class BirdFromAnimal extends AbstractAnimal
{

	//constructor
	public BirdFromAnimal(String name, int yearNamed)
	{
		super(name, yearNamed);
	}


	@Override 
	public String move()
	{
		return "fly";
	}

	@Override
	public String breathe()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
	}

	@Override 
	public String toString()
	{
		return "My name is " + name + " and my id is " + id + ". I was named in " + yearNamed;
	}


}