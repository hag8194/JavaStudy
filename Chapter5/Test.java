import animal.Animal;
import animal.land.Dog;
import animal.aquatic.Fish;
import food.*;

public class Test 
{	
	public static void main(String ... args) 
	{
		Dog dog = new Dog();
		dog.eat(DogFood.PERRARINA);
		dog.run();

		Fish fish = new Fish("Marlin");
		fish.swim();
		fish.eat(FishFood.PLANT);
	}
}


