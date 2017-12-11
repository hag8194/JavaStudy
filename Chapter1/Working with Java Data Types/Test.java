import java.util.Date;

public class Test 
{	
	int testVar;
	public static void main(String ... args) 
	{
		long longval = 3123456789L;
		String cad;
		Date myDate;
		float floatvalue = 5f, anotherOne = 6f, anotherOtherOne = 7f;

		int numericLiteral = 01_000_0;

		String $123testo_var4 = "holis";

		cad = "Holis";
		myDate = new Date();

		double val = 0;
		int val1 = 0;
		boolean val3 = false;

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println("Numero base 2: " + 0b11);
		System.out.println("Numero base 8: " + 017); 
		System.out.println("Numero base 16: " + 0x1F); 
		System.out.println(floatvalue + anotherOne + anotherOtherOne);
		System.out.println(cad + " size is " + cad.length());
		System.out.println("Date:" + myDate.toString());
		System.out.println(val + " " + val1 + " " + val3);
		System.out.println(numericLiteral);
		System.out.println(new Test().testVar); //Fields in a class are automatically initialized
		System.out.println($123testo_var4);
	}

	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
		onlyOneBranch = 1;
		answer = 1;
		} else {
		answer = 2;
		}
		System.out.println(answer);
		System.out.println(onlyOneBranch); // DOES NOT COMPILE
	}
}