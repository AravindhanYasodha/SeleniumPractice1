package Assignments.InheritanceConcepts;
//WAP on Exception Handling using TryCatch When we may get 2 exceptions in a single scenario
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment66 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();

			// Possible ArithmeticException (division by zero)
			int result = 10 / num;
			System.out.println("Result: " + result);

			// Possible NullPointerException
			String str = null;
			System.out.println("String length: " + str.length());

		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed. "+e);
		} catch (InputMismatchException e) {
			System.out.println("Error: Null reference encountered. "+e);
		} finally {
			System.out.println("Execution completed.");
			scanner.close();
		}
	}
}
