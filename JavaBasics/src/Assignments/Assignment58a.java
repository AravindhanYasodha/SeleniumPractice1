package Assignments;

public class Assignment58a {

	public void showMessage() {
		System.out.println("Public class method: Accessible from outside the package.");
	}

	class Assignment58a1 { // No 'public' keyword → Package-private

		public void showMessage() {
			System.out.println("Default class method: Cannot be accessed outside the package.");
		}
	}

}
