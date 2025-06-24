package Assignments.InheritanceConcepts;

public class Assignment44a {

	Assignment44a(String message) {
		System.out.println("Parameterized constructor: " + message);
	}

	Assignment44a() {
		this("Hello from another constructor!"); // Calling parameterized constructor using 'this'
		System.out.println("Default constructor is called.");
	}

}
