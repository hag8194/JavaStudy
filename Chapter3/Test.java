public class Test 
{	
	public static void main(String ... args) 
	{
		String cad = "testoCad";
		String newCad = new String("testoCad");

		cad += "1";
		cad += "2";
		cad = " " + cad;
		System.out.println(1 + 2 + " this is a test: " + (cad != newCad) + 4 + cad);

		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2);

		System.out.println("---STRING METHODS---");
		System.out.println("lenght: " + cad.length() + " charAt: " + cad.charAt(1) + " indexOf: " + cad.indexOf(cad.charAt(1)) + " subString: " + cad.substring(0, 2));
		System.out.println("toLowerCase: " + cad.toLowerCase() + " toUpperCase: " + cad.toUpperCase() + " equals: " + cad.equals("testo") + " equalsIgnoreCase: " + cad.equalsIgnoreCase(" TESTOCAD12"));
		System.out.println("startsWith: " + cad.startsWith(" ") + " endsWith: " + cad.endsWith("2") + " contains: " + cad.contains("12") + " replace: " + cad.replace("12" , "21") + " trim: " + cad.trim());

		System.out.println("---STRINGBUILDER METHODS---");

		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a;
		a.append("holis");

		System.out.println(a.toString() == "abcholis");
		a.insert(a.length(), "!");
		System.out.println(a);

		a.deleteCharAt(a.length() - 1);
		System.out.println(a);

		a.delete(0, 3).reverse();
		System.out.println(a);		
	}
}