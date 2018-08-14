import java.io.*;

public class Test 
{	
	public static void main(String ... args) 
	{
		try {
			new B().cMethod();
			testMethod();
		} catch(Exception e) {
			System.out.println("Handled");
			e.printStackTrace();
		}
	}

	public static void testMethod() throws Exception {
		throw new Exception();
	}
}

class A {
	void cMethod() throws IOException {

	}
}

class B extends A {
	void cMethod() throws FileNotFoundException, IllegalArgumentException, ArithmeticException,
	ArrayIndexOutOfBoundsException, StackOverflowError, ExceptionInInitializerError {
		throw new FileNotFoundException();
	}
}