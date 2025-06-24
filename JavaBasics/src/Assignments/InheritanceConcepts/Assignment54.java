package Assignments.InheritanceConcepts;
//WAP on Access specifiers within class for methods
public class Assignment54 {

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

	void testMethods() {
		// Calling all methods from within the same class
		publicMethod();
		privateMethod(); // Allowed here, but not outside this class
		protectedMethod();
		defaultMethod();
	}

	public static void main(String[] args) {
		Assignment54 ab = new Assignment54();
		ab.publicMethod();
		ab.privateMethod();
		ab.protectedMethod();
		ab.defaultMethod();

		System.out.println("===============================");
		// Calling all methods from within the same class in method
		ab.testMethods();

	}

}
