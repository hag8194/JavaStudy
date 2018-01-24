public class Test 
{	
	public static void main(String ... args) 
	{
		int a = 6, b = 1 + 2 * 3 / 4 - --a;
		short c = 1, d = 4;
		short e = (short)(c + d);
		long f = 1;
		

		boolean bool = true;
		Test testo = null;

		boolean x = true;
		boolean y = !(x = false);

		System.out.println(b);
		System.out.println(1.999999888f);
		System.out.println(e);

		System.out.println("a: " + a);
		int g = a++ + a++;
		System.out.println("g: " + g + " a: " + a);

		try {
			System.out.println(testo != null & testo.testMethod());
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println(f >= 1 || ++f <= 2);
		System.out.println(f);

		System.out.println("x: " + x + " y: " + y);
		//System.out.println(test1.a);

		for(int i = 0; i < 10; i++)
			System.out.print(i + " ");

		System.out.println("");

		for(int i = (a = 6); i < 10; ++i)
			System.out.print(i + " ");

		switch(a) {

		}
	}

	public boolean testMethod() {
		return true;
	}
}