package Assignments.InheritanceConcepts;
//WAP on Access specifiers outside package for Class
import Assignments.Assignment58a;

public class Assignment58b {

	public static void main(String[] args) {
		
		Assignment58a obj = new Assignment58a();
		obj.showMessage(); // Works, public class is accessible

		// Assignment58a1 obj2 = new Assignment58a1(); // ERROR: Default class not accessible
	}
}
	