package ClassAssignments;

public class Assignment1 {
	
	static void staticMethod() {
		System.out.println("Print static Method");
	}
	
	Assignment1(){
		System.out.println("Print default constructor first");
	}
	
	void nonStaticMethod() {
		System.out.println("Print non Static Method");
	}
	

	public static void main(String[] args) {
		staticMethod();
		Assignment1 as = new Assignment1();
		as.nonStaticMethod();

	}

}
