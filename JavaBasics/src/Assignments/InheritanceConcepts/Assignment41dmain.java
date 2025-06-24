package Assignments.InheritanceConcepts;

public class Assignment41dmain {

	public static void main(String[] args) {

		Assignment41b dog = new Assignment41b();
		Assignment41c cat = new Assignment41c();

		dog.eat(); // Accessing parent class method
		dog.bark(); // Accessing child class method

		cat.eat(); // Accessing parent class method
		cat.meow(); // Accessing child class method

	}

}
