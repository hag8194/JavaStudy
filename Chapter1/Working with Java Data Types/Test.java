import java.util.Date;

public class Test 
{	
	public static void main(String ... args) 
	{
		long longval = 3123456789L;
		String cad;
		Date myDate;
		float floatvalue = 5f, anotherOne = 6f, anotherOtherOne = 7f;

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
	}
}