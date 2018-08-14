public class Test {
	enum Testo{
		Test1, Test2, Test3
	}
	public static void main(String args []) {
		int hourOfDay = 15;

		int y = 6;
		new Test().testMethod((y > 5) ? (y * 10) : "holiwis");

		if(hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else if(hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE
		} else {
			System.out.println("Good Evening");
		}

		int dayOfWeek = 0;
		switch(dayOfWeek) {
		 default:
		 System.out.println("Weekday");
		 case 0:
		 System.out.println("Sunday");		
		 break;
		 case 6:
		 System.out.println("Saturday");
		 break;
		}

		int x = 0;
		do
			System.out.println(x++);
		while(x < 5) ;

		x = 0;
		for(long y1 = 0, z = 4; x < 5 && y1 < 10; x++, y1++) {
		 System.out.print(y1 + " ");
		}
		System.out.println(x);

		String[] names = new String[3];
		for(String name : names) { // DOES NOT COMPILE
		 System.out.print(name + " ");
		}
		
		System.out.print("\n");

		int[] values = new int[3];
		values[0] = 10;
		values[1] = new Integer(5);
		values[2] = 15;
		
		int a;
		float b;
		for(a = 0, b = 1;true && true && true;a++, b += 5) {
		 //System.out.print(values[i] - values[i - 1]);
			if(a == -1) break;
			System.out.println("I'am infinite!!!" + a + " " + b);
		}
		System.out.println();

		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
			INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
				if(mySimpleArray[i] == 2) {
					System.out.print(" ");
					break;
				}
				System.out.print(mySimpleArray[i]+"\t");
			}
			System.out.println();
		}
	}

	private void testMethod(Object param) {
		String message = "";

		switch(param.getClass().getName()) {
			case "Integer":
				message = "Integer: " + param;
				break;
			case "String":
				message = "String: " + param;
				break;
			default:
				message = "Nose: " + param;
				break;
		}
		System.out.println(message);
	}

	/*private void testMethod(int param) {
		System.out.println(param);
	}*/
}