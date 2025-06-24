package Assignments.InheritanceConcepts;
//WAP on Multiple Level Inheritance 
public class Assignment53c extends Assignment53b {

	public void child() {
		System.out.println("Child");
	}

	public static void main(String[] args) {

		Assignment53c asc = new Assignment53c();
		asc.grandParent();
		asc.parent();
		asc.child();
	}

}
