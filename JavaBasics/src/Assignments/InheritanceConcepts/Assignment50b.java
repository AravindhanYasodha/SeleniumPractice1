package Assignments.InheritanceConcepts;

public class Assignment50b extends Assignment50a{

	@Override
	void makeSound() {

		System.out.println("Making sound Woof Woof");
		
	}

	public static void main(String[] args) {
		
		Assignment50b asb = new Assignment50b();
		asb.makeSound();
		asb.sleep();
	}
	
	
}
