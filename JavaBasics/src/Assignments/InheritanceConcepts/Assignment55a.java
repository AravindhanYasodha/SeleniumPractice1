package Assignments.InheritanceConcepts;

public class Assignment55a {

	private void privateMethod() {
		System.out.println("Private method: Only accessible within this class.");
	}

	void defaultMethod() {
		System.out.println("Default method: Accessible within the package.");
	}

	protected void protectedMethod() {
		System.out.println("Protected method: Accessible within the package and subclasses.");
	}

	public void publicMethod() {
		System.out.println("Public method: Accessible from anywhere.");
	}

	public static void main(String[] args) {
		Assignment55a obj = new Assignment55a();
		obj.privateMethod(); // Works inside the same class
		obj.defaultMethod(); // Works inside the same package
		obj.protectedMethod(); // Works inside the same package
		obj.publicMethod(); // Works anywhere
	}

}
