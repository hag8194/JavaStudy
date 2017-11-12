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

		try {
			System.out.println(testo != null & testo.testMethod());
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println(f >= 1 || ++f <= 2);
		System.out.println(f);

		System.out.println("x: " + x + " y: " + y);
		System.out.println(test1.a);
	}

	public boolean testMethod() {
		return true;
	}
}