package Assignments;

//WAP to call non 3 non static methods in the main method
public class Assignment12 {

	void nonstaticmethod1() {
		System.out.println("Not static method1");
	}
	void nonstaticmethod2() {
		System.out.println("Not static method2");
	}
	void nonstaticmethod3() {
		System.out.println("Not static method3");
	}
	
	public static void main(String[] args) {
		
		Assignment12 as = new Assignment12();
		as.nonstaticmethod1();
		as.nonstaticmethod3();
		as.nonstaticmethod2();

	}

}
