package Assignments;

//Declare and initilize the variables for all datatypes
public class Assignment03 {

	public static void main(String[] args) {

		// Primitive DataType
		byte a = 127; // n-1 = 128-1
		short b = 32767; // 2^15-1
		int c = 21474; // 2^31-1
		long d = 999999999; // 2^63-1
		float e = 42.43344f;
		double f = 1234.4533635735d;
		char g = 'A';
		boolean h = true;

		// Non-Primitive DataType
		int[] intArray = { 33, 44, 55, 66, 77 };
		String words = "Group of character is String";

		System.out.println("==================================");
		System.out.println("Primitive Data Types :");
		System.out.println("Byte Value is : " + a);
		System.out.println("Short Value is : " + b);
		System.out.println("Integer Value is : " + c);
		System.out.println("Long Value is : " + d);
		System.out.println("Float Value is : " + e);
		System.out.println("Double Value is :" + f);
		System.out.println("Charater Value : " + g);
		System.out.println("Boolean is : " + h);
		System.out.println("==================================");
		System.out.println("Non-Primitive Data Types :");
		System.out.println("Array of Integer 1st Value is : " + intArray[0]);
		System.out.println("String Value is : " + words);
		System.out.println("==================================");
	}

}
