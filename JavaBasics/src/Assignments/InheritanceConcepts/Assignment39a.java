package Assignments.InheritanceConcepts;

//WAP on Single Level Inheritance
public class Assignment39a {

	public int nonstaticvar = 11;
	public static int staticvar = 22;

	void nonstaticmethod() {
		System.out.println("This is Parent Class Non Static Method");
	}

	static void staticmethod() {
		System.out.println("Calling static variable from parent to Child : " + staticvar);
		System.out.println("This is Parent Class Static Method");
	}

}
