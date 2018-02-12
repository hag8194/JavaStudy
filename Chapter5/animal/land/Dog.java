package animal.land;
import animal.Animal;
import food.DogFood;

public class Dog extends Animal {

	public Dog() {
		this("Unamed dog");
	}

	public Dog(String name) {
		super(name);
		age = 5;
		System.out.println("Dog created");
	}

	public void run() {
		System.out.println(super.getName() + " is running!");
	}

	public void eat(DogFood food) {
		System.out.println("Choosen food: " + food);
		eat();
	}
}