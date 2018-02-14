package animal;

public abstract class Animal {

	static protected int COUNT;

	private String name;
	protected int age = 2;

	protected Animal(String name) {
		this.name = name;
		System.out.println("--------------");
		System.out.println("Animal " + this.getName() + " created");
		countAnimal();
	}

	protected void eat() {
		System.out.println(this.name + " is Eating!");
	}

	protected String getName() {
		return this.name;
	}

	public int getAge() throws InvalidAgeException {
		if(age == 0) throw new InvalidAgeException();
		return age;
	}

	protected static void countAnimal() {
		++COUNT;
	}

	public static int getAnimalCount() {
		return COUNT;
	}
}
