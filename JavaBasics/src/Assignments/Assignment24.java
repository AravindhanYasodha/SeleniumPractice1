package Assignments;

//WAP to implement math class(max, abs, random,PI)
public class Assignment24 {

	static void circle() {
		int a = 2;
		int r = 4;
		double pi = Math.PI;
		System.out.println("Circumference of circle : " + (a * pi * r));

	}
	public static void main(String[] args) {
		
		double c = 11.12d;
		float d = 12.13f;
		double e = -11.12d;
		
		System.out.println(Math.max(c, d));
		System.out.println(Math.abs(e));
		System.out.println(Math.random());
		
		circle();
		

	}

}
