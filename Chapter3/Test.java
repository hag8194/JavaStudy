import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.time.*;
import java.time.format.*;

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
		System.out.println("Test cad: " + cad);
		System.out.println("lenght: " + cad.length() + " charAt: " + cad.charAt(1) + " indexOf: " + cad.indexOf(cad.charAt(1), 2) + " subString: " + cad.substring(0, 2));
		System.out.println("toLowerCase: " + cad.toLowerCase() + " toUpperCase: " + cad.toUpperCase() + " equals: " + cad.equals("testo") + " equalsIgnoreCase: " + cad.equalsIgnoreCase(" TESTOCAD12"));
		System.out.println("startsWith: " + cad.startsWith(" ") + " endsWith: " + cad.endsWith("2") + " contains: " + cad.contains("12") + " replace: " + cad.replace("12" , "21") + " trim: " + cad.trim());

		System.out.println("abc".trim()); // abc
		System.out.println("\t a b c\n".trim()); // a b c

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

		String x = "Hello World";
		String z = "Hello World".trim();
		System.out.println("String x == to z? " + (x == z)); // true

		int [] array1, array2 = {3,4,5};
		int array3[], var1;		

		array1 = new int[]{1,2};
		array3 = new int[2];
		var1 = 0;
		array3[0] = 6;

		int strArray [] = {1};	
		Object obj = strArray;
		System.out.println(strArray[0]);

		String [] literalArray = {"holis", "amiguis", "como", "lesvais"};
		String literalString = "holis";

		System.out.println(literalString == literalArray[0]);

		System.out.println("String equals StringBuilder: " + (literalString == literalString));

		int [] arrayToSort = {8,5,6,2,3,0,-1,-9};
		String [] strArrayToSort = {"bOMAIGAS", "2", "DEOS", "/hola", "%hola", "-hola", "?omege", "c122'-/*+GFDS1y deo"};
		Arrays.sort(arrayToSort);
		Arrays.sort(strArrayToSort);

		System.out.println(Arrays.toString(arrayToSort));
		System.out.println(Arrays.toString(strArrayToSort));

		System.out.println(Arrays.binarySearch(strArrayToSort, "a"));

		int [][] twoDimenArray1 = {{0}};
		int [][] twoDimenArray2 = twoDimenArray1, threeDimenArray1 [] = {{{50}}};

		System.out.println(Arrays.toString(twoDimenArray2));
		System.out.println(Arrays.toString(threeDimenArray1));

		int [][] asymArray = {{0,1}, {2,3,4}, {7,5,3,9,-1,15}};
		Arrays.sort(asymArray[2]);

		System.out.println("---Printing Asymmetric Array---");
		for(int [] arrayValue : asymArray)
			System.out.println(Arrays.toString(arrayValue));

		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		//ArrayList list3 = new ArrayList(list2);

		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();

		List<String> list = new ArrayList<>();
		list.add("hawk");//To insert elements
		list.add(1, "coco");
		list.add(0, "robin");
		System.out.println(list);
		System.out.println("Removed element at 1: " + list.remove(1));//To delete elements
		System.out.println(list);

		System.out.println("Old element at 0: " + list.set(0, "blue jay")); //To update
		System.out.println(list);

		System.out.println("Empty? " + list.isEmpty() + ". How many elements it have? " + list.size());
		list.clear();
		System.out.println("Empty? " + list.isEmpty() + ". How many elements it have? " + list.size());

		list.add("coco");
		list.add(s1);

		System.out.println("It contains blue jay? " + list.contains("blue jay") + ". Now, it contains s1? " + list.contains(s1));

		List<String> one = new ArrayList<>();
		List<String> two = new ArrayList<>();

		System.out.println("one equals two: " + one.equals(two));
		one.add("hola");
		two.add("hola");

		System.out.println("one equals two: " + one.equals(two));

		one.add(new String("holis"));
		two.add(new StringBuilder("holis").toString());

		System.out.println("one equals two: " + one.equals(two));

		one.add("agla");
		
		String[] testStrArray = one.toArray(new String[3]);
		System.out.println("Converting array to list: " + Arrays.toString(testStrArray));

		one = Arrays.asList(testStrArray);
		System.out.println("Converting list to array: " + one.toString());

		LocalDate date1 = LocalDate.of(2015, 5, 8)
			.plusYears(1)
			.plusWeeks(3)
			.plusDays(5)
			.plusMonths(2)
			.minusYears(1);
		LocalTime time1 = LocalTime.of(12, 8, 30);
		LocalDateTime localDateTime = LocalDateTime.of(date1, time1);
		System.out.println(date1);
		System.out.println(time1);
		System.out.println(localDateTime);

		Period period = Period.ofDays(2);
		Duration duration = Duration.ofHours(2);
		System.out.println(localDateTime.minus(period).minus(duration));
		System.out.println(time1.minus(duration));

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(localDateTime.format(formatter));		
		System.out.println(formatter.format(localDateTime));

		DateTimeFormatter f = DateTimeFormatter.ofPattern(",yyyy-dd : MM");
		System.out.println(localDateTime.format(f));		

		date1 = LocalDate.parse(",2105-01 : 02", f);
		System.out.println(date1);

		localDateTime = LocalDateTime.parse("2017-12-01T02:11");		
		System.out.println(localDateTime);

		/*
		*	String: Repasar return types de los métodos 							- Listo!	
		*	StringBuilder: No conozco todos los return types de sus métodos			- Listo!	
		*	Arrays.sort() : Prioridad del ordenamiento								- Listo!
		*	Repasar las formas de crear un ArrayList; tomando en cuenta la de Java5 - Listo! 
		*	¿Autoboxing se aplica a los arreglos primitivos?						- Listo!
		*	¿Collections.sort() trabaja igual que Arrays.sort()?					-
		*	
		*
		*
		*/
	}

}