package Assignments.InheritanceConcepts;
import Assignments.Assignment56a;
//WAP on Access specifiers outside the package by becoming the subclass for methods
public class Assignment56b extends Assignment56a {

	public static void main(String[] args) {

		Assignment56a obj = new Assignment56a();
		// obj.privateMethod(); // ERROR: Private method not accessible
		// obj.defaultMethod(); // ERROR: Default method not accessible outside package
		// obj.protectedMethod(); // ERROR: Protected not accessible outside package

		obj.publicMethod(); // Always accessible

		Assignment56b obj2 = new Assignment56b();
		obj2.protectedMethod(); // Works in subclass due to inheritance
		obj.publicMethod(); // Always accessible
	}

}
