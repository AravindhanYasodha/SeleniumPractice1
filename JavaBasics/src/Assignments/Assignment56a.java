package Assignments;

public class Assignment56a {

	public void publicMethod() {
		System.out.println("Public method: Accessible from anywhere.");
	}

	private void privateMethod() {
		System.out.println("Private method: Accessible only within this class.");
	}

	protected void protectedMethod() {
		System.out.println("Protected method: Accessible within the same package and subclasses.");
	}

	void defaultMethod() {
		System.out.println("Default method: Accessible within the same package.");
	}

}
