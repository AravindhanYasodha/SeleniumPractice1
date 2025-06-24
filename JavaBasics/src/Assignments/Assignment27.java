package Assignments;

import java.util.Scanner;

//WAP to print Area of Triangle using Scanner Class
public class Assignment27 {

	public static void main(String[] args) {
		
		double d = 0.5;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base Value :");
		double b = sc.nextDouble();
		System.out.println("Enter Height Value :");
		double h = sc.nextDouble();
		
		System.out.println("Area of Triangle : "+d*b*h);
		sc.close();
	}

}
