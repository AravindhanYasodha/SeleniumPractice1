package Assignments;

//WAP with combination of 3 static parameterized methods and try calling all of them
public class Assignment15 {

	static void staticpara(int age) {

		System.out.println("Interger Static Parameter "+age);
	}

	static void staticpara(String name) {

		System.out.println("String Static Parameter "+name);
	}

	static void staticpara(String name, int age) {

		System.out.println("String and Integer Static Parameter "+name+", "+age);
	}

	static void staticpara(double height) {

		System.out.println("Double Static Parameter "+height);
	}
	
	
	public static void main(String[] args) {
		
		staticpara(153.8);
		staticpara(20);
		staticpara("Aravindhan");
		staticpara("Aravidhan", 29);
	}

}
