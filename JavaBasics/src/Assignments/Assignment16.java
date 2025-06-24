package Assignments;

//WAP for Method overloading for static and non static method.
public class Assignment16 {

	
	static void staticpara(int age) {

		System.out.println("Interger Static Parameter "+age);
	}

	static void staticpara(String name) {

		System.out.println("String Static Parameter "+name);
	}

	static void staticpara(String name, int age) {

		System.out.println("String and Integer Static Parameter "+name+", "+age);
	}

	void staticpara(double height, String meter) {

		System.out.println("Double Static Parameter "+height+meter);
	}
	
	
	
	public static void main(String[] args) {
		
		Assignment16 as = new Assignment16();
		as.staticpara(153.8,"cm");
		staticpara(20);
		staticpara("Aravindhan");
		staticpara("Aravidhan", 29);

	}

}
