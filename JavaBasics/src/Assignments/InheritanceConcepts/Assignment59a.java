package Assignments.InheritanceConcepts;

public class Assignment59a {

	public void showMessage() {
		System.out.println("Public class method: Accessible from outside the package.");
	}

	static class Assignment59a1 { // No 'public' keyword → Package-private

		public void showMessage() {
			System.out.println("Default class method: Cannot be accessed outside the package.");
		}
	}
}
