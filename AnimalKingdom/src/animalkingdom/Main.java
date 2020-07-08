package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
	public static void filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester)
	{
		for (AbstractAnimal a : animals)
		{
			if (tester.test(a))
			{
				System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breathe());
			} 

		}
	}
	public static void main(String[] args)
	{

		//create animals
		MammalFromAnimal panda = new MammalFromAnimal("Panda", 1869);
		MammalFromAnimal zebra = new MammalFromAnimal("Zebra", 1778);
		MammalFromAnimal koala = new MammalFromAnimal("Koala", 1816);
		MammalFromAnimal sloth = new MammalFromAnimal("Sloth", 1804);
		MammalFromAnimal armadillo = new MammalFromAnimal("Armadillo", 1758);
		MammalFromAnimal raccoon = new MammalFromAnimal("Raccoon", 1758);
		MammalFromAnimal bigfoot = new MammalFromAnimal("Bigfoot", 2021);

		BirdFromAnimal pigeon = new BirdFromAnimal("Pigeon", 1837);
		BirdFromAnimal peacock = new BirdFromAnimal("Peacock", 1821);
		BirdFromAnimal toucan = new BirdFromAnimal("Toucan", 1758);
		BirdFromAnimal parrot = new BirdFromAnimal("Parrot", 1824);
		BirdFromAnimal swan = new BirdFromAnimal("Swan", 1758);
		

		FishFromAnimal salmon = new FishFromAnimal("Salmon", 1758);
		FishFromAnimal catfish = new FishFromAnimal("Catfish", 1817);
		FishFromAnimal perch = new FishFromAnimal("Perch", 1758);


		//Collection -> List -> ArrayList
		List<AbstractAnimal> myList = new ArrayList<>();
		List<AbstractAnimal> sortedList = new ArrayList<>();

		myList.add(panda);
		myList.add(zebra);
		myList.add(koala);
		myList.add(sloth);
		myList.add(armadillo);
		myList.add(raccoon);
		myList.add(bigfoot);
		myList.add(pigeon);
		myList.add(peacock);
		myList.add(toucan);
		myList.add(parrot);
		myList.add(swan);
		myList.add(salmon);
		myList.add(catfish);
		myList.add(perch);

		//Processing


		System.out.print("\n *** List all the animals in descending order by year named ***");
		myList.sort((a2, a1) -> a1.getYearNamed() - a2.getYearNamed());
		System.out.print(myList);

		System.out.print("\n *** List all the animals in alphabetical order ***");
		myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		System.out.print(myList);

		System.out.print("\n *** List all the animals in order by how they move ***");
		myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		System.out.print(myList);

		System.out.print("\n *** List only those animals that breath with lungs ***");
		filterAnimal(myList, a -> a.breathe() == "lungs");


		System.out.print("\n *** List only those animals that breath with lungs and were named in 1758 ***");
		filterAnimal(myList, a -> (a.breathe() == "lungs") && (a.getYearNamed() == 1758));

		System.out.print("\n *** List only those animals that lay eggs and breath with lungs ***");
		filterAnimal(myList, a -> (a.reproduce() == "eggs") && (a.breathe() == "lungs"));

		System.out.print("\n *** List alphabetically only those animals that were named in 1758 ***");
		
		myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		filterAnimal(myList, a -> (a.getYearNamed() == 1758));










	}
}