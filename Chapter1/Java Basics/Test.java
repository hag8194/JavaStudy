/** 
* JavaDoc Comment!!
* @author hgiordano
* @date 29/10/17
*/
//oneline comment
/*
Multiple lines comment
*/

import java.util.Random;
import java.util.Date;
import testo.*;

public class Test {
	
	public static void main(String ... args) 
	{
		System.out.println("Hello World!!");
		Animal animal = new Animal("Dog");
		System.out.println(animal.getName() + animal.age);
		System.out.println(animal.nameage);

		for(int i = 0; i < args.length && args[i] != null; i++)
			System.out.println(args[i]);

		System.out.println(new Random().nextInt(10));
		System.out.println(new java.sql.Date(123456789)); //Resolved naming conflict
		System.out.println(new Test1().a);
	}
}

class Animal 
{
	static {System.out.println("Static Instance Init");} //static instance initializer

	{System.out.println("Instance Init");}
	//Order of fields and instance initializer matter's
	private String name;
	int age = 20;
	String nameage = name + age;
	{nameage += " OMG"; System.out.println("OH");}

	//The constructor run after all fields and instance initializer blocks have run
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}