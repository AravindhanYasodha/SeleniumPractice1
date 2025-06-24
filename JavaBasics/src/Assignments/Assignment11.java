package Assignments;

//WAP to call one non static method in the main method
public class Assignment11 {

	
	void nonstaticmethod() {
		System.out.println("Not static method");
	}
	
	public static void main(String[] args) {
		
		Assignment11 as = new Assignment11();
		as.nonstaticmethod();
	}

}
