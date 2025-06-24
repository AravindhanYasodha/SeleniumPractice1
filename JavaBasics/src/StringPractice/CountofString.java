package StringPractice;

import java.util.Arrays;

public class CountofString {

	static void method1() {
		String name = "k v no 2";
		int count = 0;
		
		char[] c1 = name.toCharArray();
		System.out.println(Arrays.toString(c1));

		for (int i = 0; i < name.length(); i++) {

			char c = name.charAt(i);
			if (Character.isAlphabetic(c)) {
				count++;
			}
		}
		System.out.println("Method1 Total Count of String : " + count);

	}

	static void method2() {

		String name = "k v no 2£&";
		
		int stringcount = 0;
		int digitcount = 0;
		int spacecount = 0;
		
		

		char[] c1 = name.toCharArray();
		System.out.println(Arrays.toString(c1));
		

		for (int i = 0; i < name.length(); i++) {
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
			boolean b3 = Character.isWhitespace(c1[i]);
			// System.out.println(b1);
			if (b1 == true) {
				stringcount++;
			}
			if(b2 == true) {
				digitcount++;
			}
			if(b3 == true) {
				spacecount++;
			}

		}
		int specialcount = c1.length-(stringcount+digitcount+spacecount);
		System.out.println("Method2 Total Number of String : "+stringcount);
		System.out.println("Method2 Total Number of Digit : "+digitcount);
		System.out.println("Method2 Total Number of WhiteSpace : "+spacecount);
		System.out.println("Method2 Total Number of Special Character : "+specialcount);
	}

	public static void main(String[] args) {

		method1();

		method2();

	}
}
