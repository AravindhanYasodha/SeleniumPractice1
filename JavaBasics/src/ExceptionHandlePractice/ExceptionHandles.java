package ExceptionHandlePractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandles {

	/*
	 * Throw : Throws : Throwable :
	 */

	static void CheckedException() throws InterruptedException {

		// Checked Exception :

		// MalformedURLException = Wrong URL
		// IOException = File not found
		// InterruptedException

		Thread.sleep(1000);
	}

	static void UncheckedException() {

		// UnChecked Exceptions :

		// ArrayIndexOutofBoundEx
		// NullPointer
		// ArithmeticEx
		// IllegalExce

		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();// Enter String value instead of int value
			System.out.println(a);
			sc.close();
		} catch (InputMismatchException im) {
			System.out.println("InputMismatch Exception handled");

		}

	}

	public static void main(String[] args) throws InterruptedException {
		CheckedException();
		UncheckedException();

	}

}
