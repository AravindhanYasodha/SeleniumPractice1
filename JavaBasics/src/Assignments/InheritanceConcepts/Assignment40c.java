package Assignments.InheritanceConcepts;
//WAP on Multi Level Inheritance
public class Assignment40c extends Assignment40b {

	public int child = 15;

	public static int childStatic = 10;

	static void childStatic() {
		System.out.println("Child Static Age : " + childStatic);
	}

	void child1() {
		System.out.println("Child1 Static variable Age : " + childStatic);
	}

	void child2() {
		System.out.println("Child2 Age : " + child);
	}

	public static void main(String[] args) {
		// Child Class Property
		childStatic();
		Assignment40c asc = new Assignment40c();
		asc.child1();
		asc.child2();

		// Parent Class Property
		parentStatic();
		asc.parent1();
		asc.parent2();

		// Grand Parent Class Property
		grandParentStatic();
		asc.grandParent1();
		asc.grandParent2();

	}

}
