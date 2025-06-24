package Assignments.InheritanceConcepts;

//WAP on String Function using toCharArray concept
public class Assignment73 {

	public static void main(String[] args) {
		// Define a string
		String text = "Hello, Copilot!";

		// Convert the string to a character array
		char[] charArray = text.toCharArray();

		// Reverse the string using character array
		System.out.print("Reversed string: ");
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
}
