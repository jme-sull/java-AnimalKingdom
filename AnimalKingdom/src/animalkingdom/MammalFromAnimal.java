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



}