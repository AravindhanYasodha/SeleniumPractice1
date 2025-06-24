package Assignments.InheritanceConcepts;

public class Assignment46b extends Assignment46a {

	String name = "Assignment46b";

	void display() {
		super.display(); // Calling parent class method
		System.out.println("This is a Assignment46b.");
	}

	void showNames() {
		System.out.println("Child class name: " + name);
		System.out.println("Parent class name: " + super.name); // Accessing parent class variable
	}

	Assignment46b() {
		super(); // Calling parent class constructor
		System.out.println("Child class constructor is called.");
	}
}
