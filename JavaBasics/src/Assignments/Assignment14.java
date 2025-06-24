package Assignments;

//WAP with combination of 4 non static parameterized methods and try calling all of them
public class Assignment14 {

	void nonstaticpara(int age) {

		System.out.println("Interger Non Static Parameter "+age);
	}

	void nonstaticpara(String name) {

		System.out.println("String Non Static Parameter "+name);
	}

	void nonstaticpara(String name, int age) {

		System.out.println("String and Integer Non Static Parameter "+name+", "+age);
	}

	void nonstaticpara(double height) {

		System.out.println("Double Non Static Parameter "+height);
	}

	public static void main(String[] args) {
		
		Assignment14 as = new Assignment14();
		as.nonstaticpara(18);
		as.nonstaticpara("Aravindhan",29);
		as.nonstaticpara("Aravindhan");
		as.nonstaticpara(153.5);
	}

}
