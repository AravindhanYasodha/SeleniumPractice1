package Assignments.InheritanceConcepts;
//Wap on String Function using toupperCase,toLowerCase,length,charAt,trim concepts
import java.util.Scanner;

public class Assignment67 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine(); // Read user input

		// Convert to uppercase
		System.out.println("Uppercase: " + input.toUpperCase());

		// Convert to lowercase
		System.out.println("Lowercase: " + input.toLowerCase());

		// Get length of the string
		System.out.println("Length: " + input.length());

		// Get first character using charAt()
		if (input.length() > 0) {
			System.out.println("First character: " + input.charAt(0));
		} else {
			System.out.println("String is empty, no first character.");
		}

		// Trim spaces from the string
		System.out.println("Trimmed string: '" + input.trim() + "'");

		scanner.close();
	}
}
