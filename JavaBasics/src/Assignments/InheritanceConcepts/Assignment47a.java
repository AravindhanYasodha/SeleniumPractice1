package Assignments.InheritanceConcepts;

public class Assignment47a {

	String name;

	// Constructor using 'this' keyword
	Assignment47a(String name) {
		this.name = name; // Refers to the instance variable
	}

	void display() {
		System.out.println("Name: " + this.name); // Using 'this' to refer to instance variable
	}

	void show() {
		this.display(); // Calling another method using 'this'
	}

	public static void main(String[] args) {

		Assignment47a obj = new Assignment47a("John");
		obj.show();

	}

}
