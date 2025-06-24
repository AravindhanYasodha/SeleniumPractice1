package Assignments.InheritanceConcepts;
//WAP on finally keyword concept
import java.util.Scanner;

public class Assignment64 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter two numbers: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			int result = num1 / num2; // May cause ArithmeticException (division by zero)
			System.out.println("Result: " + result);
		} catch (Exception e) {
			System.out.println("Error: Division by zero is not allowed. " + e);
		} finally {
			System.out.println("Execution completed.");
			scanner.close();
		}
	}
}
