package Assignments.InheritanceConcepts;
//WAP to terminate any program using Throw keyword
import java.util.Scanner;

public class Assignment65 {
	public static void validateAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Access denied: Age must be 18 or above.");
		} else {
			System.out.println("Access granted.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		validateAge(age); // Throws exception and Terminate the Program if age < 18

		System.out.println("Program continues...");
		scanner.close();
	}
}
