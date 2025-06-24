package Assignments.InheritanceConcepts;
//WAP on constructors of a String Buffer and constructors of a String Builder
public class Assignment88 {
	public static void main(String[] args) {
		// StringBuffer Constructors
		StringBuffer sb1 = new StringBuffer(); // Default capacity (16)
		StringBuffer sb2 = new StringBuffer("Hello"); // Initializes with "Hello"
		StringBuffer sb3 = new StringBuffer(50); // Sets initial capacity to 50

		// StringBuilder Constructors
		StringBuilder sb4 = new StringBuilder(); // Default capacity (16)
		StringBuilder sb5 = new StringBuilder("World"); // Initializes with "World"
		StringBuilder sb6 = new StringBuilder(30); // Sets initial capacity to 30

		// Displaying results
		System.out.println("StringBuffer Example:");
		System.out.println("sb1 (default): " + sb1.capacity());
		System.out.println("sb2 (initialized with 'Hello'): " + sb2);
		System.out.println("sb3 (capacity 50): " + sb3.capacity());

		System.out.println("\nStringBuilder Example:");
		System.out.println("sb4 (default): " + sb4.capacity());
		System.out.println("sb5 (initialized with 'World'): " + sb5);
		System.out.println("sb6 (capacity 30): " + sb6.capacity());
	}
}