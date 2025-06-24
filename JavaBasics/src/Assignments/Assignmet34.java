package Assignments;

//WAP for static and non static global varibles and utilize them in both static and non static methods
public class Assignmet34 {

	static String name = "Aravindhan";
	String password = "*******";

	void enterUsename(String name) {

		System.out.println(name);
	}

	static void enterPassword(String pass) {

		System.out.println(pass);
	}

	public static void main(String[] args) {
		
		Assignmet34 as = new Assignmet34();
		as.enterUsename(name);

		enterPassword(as.password);

	}

}
