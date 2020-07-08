package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main
{
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

		System.out.print(myList);
	}
}