package Assignments.InheritanceConcepts;
//WAP on Exception handling using nested try catch keywords
import java.util.Scanner;

public class Assignment62 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter two numbers: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			int result = num1 / num2; // May cause ArithmeticException (division by zero)
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed. " + e);
		} catch (Exception e) {
			System.out.println("Other Error: " + e);
		} finally {
			System.out.println("Execution completed.");
			scanner.close();
		}
	}
}
