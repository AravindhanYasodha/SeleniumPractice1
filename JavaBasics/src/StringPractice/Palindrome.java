package StringPractice;

import java.util.Arrays;

public class Palindrome {

	static void method1() {

		String name = "Madam";
		String output = "";

		char[] c1 = name.toCharArray();
		System.out.println(Arrays.toString(c1));

		for (int i = name.length() - 1; i >= 0; i--) {

			output += name.charAt(i);
		}
		if (output.equalsIgnoreCase(name)) {
			System.out.println("Name is Palindrom");
		} else {
			System.out.println("Name is Not a Palindrom");
		}
		System.out.println(output);
	}

	static void voting() {

		int age = 12;

		assert age >= 18 : "Age is below 18."; // Provide a message for the error
		{
			System.out.println("Eligible for Vote");
		}
	}

	static void method2() {

		String stg = "Malayalam";
		String output = "";

		char[] c1 = stg.toCharArray();
		System.out.println(Arrays.toString(c1));

		for (int i = stg.length() - 1; i >= 0; i--) {
			output += stg.charAt(i);
		}
		boolean b1 = output.equalsIgnoreCase(stg);
		if (b1 == true) {
			System.out.println("String is Palindrom");
		} else {
			System.out.println("String is Not a Palindrom");
		}
		System.out.println(output);

	}

	public static void main(String[] args) {

//		method1();
//		method2();
		voting();

	}

}
