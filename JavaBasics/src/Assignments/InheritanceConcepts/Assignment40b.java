package Assignments.InheritanceConcepts;
//WAP on Multi Level Inheritance
public class Assignment40b extends Assignment40a {

	public int parent = 35;

	public static int parentStatic = 30;

	static void parentStatic() {
		System.out.println("Parent Static Age : " + parentStatic);
	}

	void parent1() {
		System.out.println("Parent1 Static variable Age : " + parentStatic);
	}

	void parent2() {
		System.out.println("Parent2 Age : " + parent);
	}

	@Override
	void grandParent1() {
		// TODO Auto-generated method stub
		super.grandParent1();
	}

	@Override
	void grandParent2() {
		// TODO Auto-generated method stub
		super.grandParent2();
	}

}
