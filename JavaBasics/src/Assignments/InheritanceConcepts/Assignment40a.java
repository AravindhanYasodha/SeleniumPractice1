package Assignments.InheritanceConcepts;
//WAP on Multi Level Inheritance
public class Assignment40a {

	public int grandParent = 60;

	public static int grandParentStatic = 59;

	static void grandParentStatic() {
		System.out.println("Grand Parent Static Age : " + grandParentStatic);
	}

	void grandParent1() {
		System.out.println("Grand Parent1 Static variable Age : " + grandParentStatic);
	}

	void grandParent2() {
		System.out.println("Grand Parent2 Age : " + grandParent);
	}
}
