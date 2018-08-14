import java.util.*;
import java.util.function.Predicate;
public class Test 
{

	{testoCad = "oemege";}
	

	static {
		testCadStatic = "init";
	}

	private static final String testCadStatic;

		
	/*static {
		testCadStatic = "init2";
	}*/


	Test() {
		this("No va lue passed");
	}

	Test(boolean keepEmpty) {
		this("No value passed", keepEmpty);
	}

	Test(String testoValue)	{
		this.testoCad = testoValue;
	}

	Test(String testoValue, boolean keepEmpty) {
		if(!keepEmpty)
			this.testoCad = testoValue;
	}

	private String testoCad;

	private void print() {
		System.out.println(testoCad);
	}

	public static void main(String ... args) 
	{
		Test test = new Test(true);
		test.print();

		System.out.println(Test.testCadStatic);

		/*List<Animal> animals = new ArrayList<Animal>(); // list of animals

		Animal fish = new Animal("fish", false, true); 
		animals.add(fish);
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));		

		final boolean testo = true;
		//testCadStatic = "holis";

		print(animals, a -> {return a.canHop() && testo && testCadStatic.equals("holis");});
		//testCadStatic = "holis no";
		print(animals, a -> a.canSwim() && testo && testCadStatic.equals("holis"));

		print(fas -> fas.canHop() && testo);*/
	}

	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();		
	}

	private static void print(Animal animal, Predicate<Animal> checker) {
		if (checker.test(animal)) // the general check
			System.out.print(animal + " ");
		System.out.println();			
	}

	private static void print(Predicate<Animal> checker) {
		Animal kangaroo = new Animal("kangaroo", true, false);
		print(kangaroo, checker);
	}
}

class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		this();
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	public boolean canHop() { return canHop; }
	public boolean canSwim() { return canSwim; }
	public String toString() { return species; }
}	

interface CheckTrait {
	boolean test(Animal a);
}

/*class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {	
		return a.canHop();
	}
}*/