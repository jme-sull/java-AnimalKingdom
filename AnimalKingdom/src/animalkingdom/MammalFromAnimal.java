package animalkingdom;

public class MammalFromAnimal extends AbstractAnimal
{

	//constructor
	public MammalFromAnimal(String name, int yearNamed)
	{
		super(name, yearNamed);
	}


	@Override 
	public String move()
	{
		return "walk";
	}

	@Override
	public String breathe()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "live births";
	}

	@Override 
	public String toString()
	{
		return "My name is " + name + " and my id is " + id + ". I was named in " + yearNamed;
	}


}