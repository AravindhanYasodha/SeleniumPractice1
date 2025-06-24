package Assignments;

public class Assignmnet57a {

	private void privateMethod() {
		System.out.println("Private method: Not accessible outside the class.");
	}

	void defaultMethod() {
		System.out.println("Default method: Not accessible outside the package.");
	}

	protected void protectedMethod() {
		System.out.println("Protected method: Only accessible through inheritance.");
	}

	public void publicMethod() {
		System.out.println("Public method: Accessible from anywhere.");
	}
}