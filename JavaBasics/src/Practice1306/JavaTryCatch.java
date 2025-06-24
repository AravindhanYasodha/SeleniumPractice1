package Practice1306;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaTryCatch {

	public static void trycatchpro() {
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[5]); // Throws ArrayIndexOutOfBoundsException

			int result = 10 / 0; // Throws ArithmeticException

			String str = null;
			System.out.println(str.length()); // Throws NullPointerException

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
		}

		System.out.println("Program continues...");
	}

	public static void main(String[] args) {
		trycatchpro();
	}
}
