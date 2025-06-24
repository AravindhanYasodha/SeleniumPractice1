package Assignments.InheritanceConcepts;
//WAP on Access specifiers outside the package without becoming the subclass for methods
import Assignments.Assignmnet57a;

public class Assignment57b {

	public static void main(String[] args) {

		Assignmnet57a obj = new Assignmnet57a();

		// obj.privateMethod(); // ERROR: Private method not accessible
		// obj.defaultMethod(); // ERROR: Default method not accessible outside package
		// obj.protectedMethod(); // ERROR: Protected method not accessible without subclassing

		obj.publicMethod(); // Works perfectly, public method is accessible

	}

}
