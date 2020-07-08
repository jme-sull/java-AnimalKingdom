package animalkingdom;

public class FishFromAnimal extends AbstractAnimal
{

	//constructor
	public FishFromAnimal(String name, int yearNamed)
	{
		super(name, yearNamed);
	}


	@Override 
	public String move()
	{
		return "swim";
	}

	@Override
	public String breathe()
	{
		return "gills";
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