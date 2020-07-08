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
	abstract String getName();
	abstract int getYearNamed();
	abstract int getId();
	
	String eat() //child decideds if public or private, but must implemnt eat in this way, correct?
	{
		return "Omnomnom";
	}




}