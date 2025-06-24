package ClassAssignments;

import java.util.Scanner;

public class Assignment2Area {

	void rectangle() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breath value : ");
		int b = sc.nextInt();
		System.out.println("Enter height value : ");
		int h = sc.nextInt();

		System.out.println("Area of Rectangle : " + b * h);

	}

	void square() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of breath and height : ");
		int a = sc.nextInt();

		System.out.println("Area of square : " + a * a);

	}

	void triangle() {

		double a = 0.5d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter breath value : ");
		int b = sc.nextInt();
		System.out.println("Enter height value : ");
		int h = sc.nextInt();

		System.out.println("Area of triangle : " + a + h * b);

	}

	void circle() {

		double pi = Math.PI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius value :");
		double r = sc.nextDouble();

		System.out.println("Area of circle : " + pi * r * r);
		
	}

	public static void main(String[] args) {

		Assignment2Area aa = new Assignment2Area();
		aa.rectangle();
		aa.square();
		aa.triangle();
		aa.circle();
	}

}
