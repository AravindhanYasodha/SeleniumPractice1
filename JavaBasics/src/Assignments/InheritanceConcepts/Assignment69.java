package Assignments.InheritanceConcepts;
//WAP on String Function using equals and equalsIgnoreCase concept
import java.util.Scanner;

public class Assignment69 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter second string: ");
		String str2 = scanner.nextLine();

		// Using equals() to compare strings (case-sensitive)
		if (str1.equals(str2)) {
			System.out.println("Strings are exactly equal.");
		} else {
			System.out.println("Strings are NOT equal.");
		}

		// Using equalsIgnoreCase() to compare strings (case-insensitive)
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Strings are equal (ignoring case).");
		} else {
			System.out.println("Strings are NOT equal (even ignoring case).");
		}

		scanner.close();
	}
}
