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
		System.out.println("***********");
		System.out.println("Dog created");
	}

	public String getName() {
		System.out.println("[Getting dog name]");
		return super.getName();
	}

	public void run() {
		System.out.println(getName() + " is running!");
	}

	public void eat(DogFood food) {
		System.out.println("Choosen food: " + food);
		eat();
	}

	public int getAge() throws InvalidDogAgeException {
		if(age == 0) throw new InvalidDogAgeException();
		return age;
	}
}