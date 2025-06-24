package Assignments.InheritanceConcepts;

public class Assignment60 {

	// Static Initialization Block (SIB) - executes when class is loaded
	static void method1() {
		System.out.println("Static Initialization Block (SIB) with Method1 executed.");
	}

	static {
		System.out.println("Static Initialization Block (SIB) without Method1 executed.");
	}
	// Instance Initialization Block (IIB) - executes before constructor for each
	// object
	{
		System.out.println("Instance Initialization Block (IIB) executed.");
	}

	// Constructor - executes after IIB
	public Assignment60() {
		System.out.println("Constructor executed.");
	}

	public static void main(String[] args) {
		System.out.println("Main method starts.");

		// Creating first object
		Assignment60 obj1 = new Assignment60();
		obj1.method1();
		// Creating second object
		Assignment60 obj2 = new Assignment60();
		obj2.method1();

		// SIB runs only once (when the class loads).
		// IIB runs each time an object is created, before calling the constructor.
		// Execution Order → SIB → Main Method → IIB → Constructor.

	}
}
