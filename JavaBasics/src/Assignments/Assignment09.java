package Assignments;

//WAP on logical operators with AND, OR, AND-NOT and Or-not
public class Assignment09 {

	static void comparingnumber() {

		int num1 = 10;
		int num2 = 20;

		// Logical AND
		if (num1 > 5 && num2 > 15) {
			System.out.println("Both conditions are true (num1 > 5 AND num2 > 15).");
		}

		// Logical OR
		if (num1 > 15 || num2 > 15) {
			System.out.println("At least one condition is true (num1 > 15 OR num2 > 15).");
		}

		// Logical NOT
		if (!(num1 > 15)) {
			System.out.println("num1 is NOT greater than 15.");
		}
	}

	static void checkingmultipleflag() {

		boolean isLoggedIn = true;
		boolean hasPremiumAccount = true;

		// Logical AND-NOT
		if (isLoggedIn && !hasPremiumAccount) {
			System.out.println("Welcome, Premium User!");
		} else {
			System.out.println("Please upgrade to a Premium account.");
		}

		// Logical OR-NOT
		if (isLoggedIn || !hasPremiumAccount) {
			System.out.println("Welcome, User!");
		}
	}

	public static void main(String[] args) {

		comparingnumber();
		checkingmultipleflag();

	}

}
