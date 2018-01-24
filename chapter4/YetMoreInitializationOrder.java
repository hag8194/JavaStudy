public class YetMoreInitializationOrder {
	static { add(2); }

	static void add(int num) { System.out.print(num + " "); }

	YetMoreInitializationOrder() { add(5); }

	static { add(4); }

	{ add(6); }

	static { new YetMoreInitializationOrder(); }

	static { add(9); }

	{ add(8); }

	public static void main(String[] args) { System.out.println(Testo.testInt); } 
}

class Testo {
	static {testCad = " nawebonaiss"; testInt = 1000; testBool = true;}
	public static String testCad;
	public static int testInt;
	public static boolean testBool;

	static {System.out.println(testCad);}
}