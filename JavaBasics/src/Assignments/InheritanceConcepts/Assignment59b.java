package Assignments.InheritanceConcepts;
//WAP on Access specifiers within package for Class
import Assignments.InheritanceConcepts.Assignment59a.Assignment59a1;

public class Assignment59b {

	public static void main(String[] args) {

		Assignment59a obj = new Assignment59a();
		obj.showMessage(); // Works, public class is accessible

		Assignment59a1 obj2 = new Assignment59a1(); // Works, static DefaultClass is accessible within the package
		// Assignment59a1 obj2 = obj.new Assignment59a1(); // Works, non static DefaultClass is accessible within the package
		obj2.showMessage();
	}

}
