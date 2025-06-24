package Assignments;

//WAP to call Constructor with parameter and without parameter
public class Assignment17 {

	Assignment17() {

		System.out.println("Constructor without Parameter");
	}

	Assignment17(String name) {

		System.out.println("Constructor with Parameter :"+name);
	}
	
	void nonStaticMethod() {
		
		System.out.println("Non Static Method");
	}

	public static void main(String[] args) {
		
		Assignment17 as = new Assignment17();
		as.nonStaticMethod();
		new Assignment17("Aravindhan");
		

	}

}
