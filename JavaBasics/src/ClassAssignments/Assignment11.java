package ClassAssignments;

import java.util.Scanner;

public class Assignment11 {
	
	
	
	
	static void staticMethod() {
		System.out.println("Print Static Method");
	}

	static void staticMethodWithParam(String param) {
		System.out.println("Print Static Method with Parameter : "+param);
	}
	
	Assignment11(){
		System.out.println("Print default Constructor Method");
	}
	
	Assignment11(String param){
		System.out.println("Print Parametarized Constructor Method with parameter : "+param);
	}
	
	void nonStaticMethod() {
		System.out.println("Print Non Static Method");
	}
	
	void nonStaticMethod(String param) {
		System.out.println("Print Non Static Method with Parameter : "+param);
	}
	
	static void scannerMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : "+sc.next());
		sc.close();
	}
	
	public static void main(String[] args) {
		
		staticMethod();
		staticMethodWithParam("Good Morning");
		
		Assignment11 as1 = new Assignment11("Good Afternoon");
		//Assignment11 as = new Assignment11();
		new Assignment11();
		
		as1.nonStaticMethod();
		as1.nonStaticMethod("Good Night");
		
		scannerMethod();

	}

}
