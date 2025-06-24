package Assignments.InheritanceConcepts;

//WAP on return keyword
public class Assignment106 {

	// Method returning a value
	public static int add(int a, int b) {
		return a + b; // Returns the sum
	}

	// Method with void return type
	public static void printMessage() {
		System.out.println("Hello, this method has no return value!");
		return; // Optional in void methods
	}

	public static void main(String[] args) {
		// Calling method that returns a value
		int result = add(5, 10);
		System.out.println("Sum: " + result);

		// Calling method with void return type
		printMessage();
	}
}
