package animalkingdom;

abstract class AbstractAnimal
{
	//fields

	protected static int maxId = 0

	protected int id; 
	protected String name;
	protected String yearNamed; 

	//constructor

	public AbstractAnimal(String name, int yearNamed )
	{
		maxId++;

		this.id = maxId;
		this.name = name;
		this.yearNamed = yearNamed;

	}

	//methods - how do I write the eat method? I need to review the lesson 


}