package Assignments;

//WAP with combination of static and non static methods and try calling both of them
public class Assignment13 {

	
	void nonstaticmethod() {
		System.out.println("Not static method");
	}
	
	static void staticmethod() {
		System.out.println("Static Method");
	}
	
	
	public static void main(String[] args) {
		
		staticmethod();
		
		Assignment13 as = new Assignment13();
		as.nonstaticmethod();
		
	}

}
