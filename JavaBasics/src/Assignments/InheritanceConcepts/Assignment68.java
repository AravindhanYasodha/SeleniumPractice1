package Assignments.InheritanceConcepts;
//Wap on String Function using concat and contains concept
import java.util.Scanner;

public class Assignment68 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter second string: ");
		String str2 = scanner.nextLine();

		// Using concat() to join two strings
		String combined = str1.concat(str2);
		System.out.println("Concatenated String: " + combined);

		// Using contains() to check if str1 contains a specific word
		System.out.print("Enter a word to check in first string: ");
		String word = scanner.nextLine();

		if (str1.contains(word)) {
			System.out.println("The first string contains '" + word + "'.");
		} else {
			System.out.println("The first string does not contain '" + word + "'.");
		}

		scanner.close();
	}
}
