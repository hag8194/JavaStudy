package animal.aquatic;
import animal.Animal;
import food.FishFood;

public class Fish extends Animal {

	public Fish(String name) {
		super(name);
		age = 5;
		System.out.println("Fish created");
	}

	public void swim() {
		System.out.println(getName() + " is swimming!");
	}

	public void eat(FishFood food) {
		System.out.println("Choosen food: " + food);
		eat();
	}
}