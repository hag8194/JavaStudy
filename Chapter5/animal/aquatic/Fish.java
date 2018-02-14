package animal.aquatic;
import animal.Animal;
import food.FishFood;

public class Fish extends Animal {
	private int age = 6;

	public Fish(String name) {
		super(name);
		System.out.println("************");
		System.out.println("Fish created");
	}

	public String getName() {
		System.out.println("[Getting fish name]");
		return super.getName();
	}

	public void swim() {
		System.out.println(getName() + " is swimming!");
	}

	public void eat(FishFood food) {
		System.out.println("Choosen food: " + food);
		eat();
	}

	public int getAge() {
		return age + super.age;
	}

	protected static void countAnimal() {
		System.out.println("Hidden");
	}

	public static int getAnimalCount() {
		System.out.println("Parent class method has been Hidden from Fish");
		return 0;
	}
}