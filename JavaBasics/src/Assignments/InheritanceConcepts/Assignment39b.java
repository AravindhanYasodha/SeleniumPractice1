package Assignments.InheritanceConcepts;

public class Assignment39b extends Assignment39a {

	int nonstaticvar = 33;
	static int staticvar = 44;

	void childnonstaticmethod() {
		System.out.println("This is Child Class Non Static Method");
	}

	static void childstaticmethod() {
		System.out.println("This is Child Class Static Method");
	}

	public static void main(String[] args) {
		// Child Class
		System.out.println(staticvar);
		Assignment39b as = new Assignment39b();
		System.out.println(as.nonstaticvar);
		childstaticmethod();
		as.childnonstaticmethod();

		// Parent Class
		Assignment39a as1 = new Assignment39a();
		System.out.println(as1.nonstaticvar);
		staticmethod();
		as1.nonstaticmethod();
	}

}
