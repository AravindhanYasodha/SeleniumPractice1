package Assignments.InheritanceConcepts;

public class Assignment49b extends Assignment49a{

	@Override
	void makeSound() {

		System.out.println("Making sound Woof Woof");
		
	}

	public static void main(String[] args) {
		
		Assignment49b asb = new Assignment49b();
		asb.makeSound();
	}
	
	
}
