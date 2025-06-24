package Assignments;

//WAP on Constructor Overloading
public class Assignment18 {

	Assignment18(){
		System.out.println("Default constructor");
	}
	Assignment18(String gender) {
		System.out.println("Gender :"+gender);
	}

	Assignment18(int age) {
		System.out.println("Age :"+age);
	}

	Assignment18(String gender, int age) {
		System.out.println("Gender :"+gender+", Age :"+age);
	}

	Assignment18(String gender, int age, double height) {
		System.out.println("Gender :"+gender+", Age :"+age+", Height :"+height);
	}

	public static void main(String[] args) {
		
		new Assignment18();
		new Assignment18("Male");
		new Assignment18(12);
		new Assignment18("Female",14);
		new Assignment18("Unknown",16,103);
	}

}
