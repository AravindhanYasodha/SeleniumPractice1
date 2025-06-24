package ClassAssignments;

import java.util.Scanner;

public class Assignment2Circumference {

	void rectangle() {
		int a = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breath value : ");
		int b = sc.nextInt();
		System.out.println("Enter height value : ");
		int h = sc.nextInt();

		System.out.println("Circumference of Rectangle : " + (a * (b + h)));

	}

	void square() {
		int a = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of breath and height : ");
		int b = sc.nextInt();

		System.out.println("Circumference of square : " + (a * b));

	}

	void triangle() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breath value : ");
		int a = sc.nextInt();
		System.out.println("Enter height1 value : ");
		int b = sc.nextInt();
		System.out.println("Enter height2 value : ");
		int h = sc.nextInt();

		System.out.println("Circumference of triangle : " + (a + b + h));

	}

	void circle() {
		int a = 2;
		double pi = Math.PI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius value :");
		double r = sc.nextDouble();

		System.out.println("Circumference of circle : " + (a * pi * r));

	}

	public static void main(String[] args) {

		Assignment2Circumference aa = new Assignment2Circumference();
		aa.rectangle();
		aa.square();
		aa.triangle();
		aa.circle();
	}

}
