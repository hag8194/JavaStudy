import animal.Animal;
import animal.InvalidAgeException;
import animal.land.Dog;
import animal.aquatic.Fish;
import food.DogFood;
import food.FishFood;
import java.util.function.Predicate;

public class Test 
{	
	public static void main(String ... args) 
	{
		Predicate<Animal> animalCheck = animal -> {
			try {
				return animal.getAge() > 0;
			} catch(InvalidAgeException e) {
				return false;
			}
			
		};

		Dog dog = new Dog();
		dog.eat(DogFood.PERRARINA);
		dog.run();
		
		printAnimalAge(animalCheck, dog);

		Fish fish = new Fish("Marlin");
		fish.swim();
		fish.eat(FishFood.PLANT);
		
		printAnimalAge(animalCheck, fish);

		System.out.println("-----------------");
		System.out.println("Animal count: " + Fish.getAnimalCount());
		System.out.println("Animal count: " + Dog.getAnimalCount());
	}

	static void printAnimalAge(Predicate<Animal> animalCheck, Animal animal) {
		try {
			if(animalCheck.test(animal))
				System.out.println(animal instanceof Dog ? "Dog age: " + ((Dog)animal).getAge() : "Fish age: " 
					+ ((Fish) animal).getAge());
			else
				System.out.println("Invalid age");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}