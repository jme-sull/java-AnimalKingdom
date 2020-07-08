package animalkingdom;

abstract class AbstractAnimal
{
	//fields

	protected static int maxId = 0;

	protected int id; 
	protected String name;
	protected int yearNamed; 

	//constructor

	public AbstractAnimal(String name, int yearNamed )
	{
		maxId++;

		this.id = maxId;
		this.name = name;
		this.yearNamed = yearNamed;

	}

	//methods 
	abstract String move();
	abstract String breathe();
	abstract String reproduce(); 

	String eat() //child decideds if public or private, but must implemnt eat in this way, correct?
	{
		return "Omnomnom";
	}

	String getName()
	{
		return name;
	}

	int getYearNamed()
	{
		return yearNamed;
	}

	int getId()
	{
		return id;
	}

	@Override
	public String toString()
	{ 
		return "\n Animals {id=" + id + " name=" + name + " yearNamed=" + yearNamed + "}";
	}






}