package Assignments;

//WAP to declare a vairable inside a static and non static  Method. For local varable
public class Assignment33 {

	static void enterUsename() {

		String name = "Aravindhan";
		System.out.println(name);
	}

	void enterPassword() {

		String pass = "********";
		System.out.println(pass);
	}

	public static void main(String[] args) {
		
		enterUsename();
		
		Assignment33 as = new Assignment33();
		as.enterPassword();

	}

}
