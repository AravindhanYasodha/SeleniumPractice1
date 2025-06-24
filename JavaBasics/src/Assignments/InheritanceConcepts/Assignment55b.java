package Assignments.InheritanceConcepts;
//WAP on Access specifiers within package for methods
public class Assignment55b {

	public static void main(String[] args) {

		Assignment55a obj = new Assignment55a();
		// obj.privateMethod(); // ERROR: Private method not accessible
		obj.defaultMethod(); // Accessible within the package
		obj.protectedMethod(); // Accessible within the package
		obj.publicMethod(); // Accessible from anywhere

	
	}

}
