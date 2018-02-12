package animal;

public class Animal {

	private String name;
	protected int age;

	protected Animal(String name) {
		this.name = name;
		System.out.println("Animal created");
	}

	protected void eat() {
		System.out.println(this.name + " is Eating!");
	}

	public String getName() {
		return this.name;
	}
}
