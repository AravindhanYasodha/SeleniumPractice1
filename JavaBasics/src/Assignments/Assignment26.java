package Assignments;

import java.util.Scanner;

//WAP to print Circumference of Circle using Scanner Class
public class Assignment26 {

	public static void main(String[] args) {
		
		double pi = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Area Value :");
		double a = sc.nextDouble();
		System.out.println("Enter Radius Value :");
		double r = sc.nextDouble();
		
		System.out.println("Circumference of Circle : "+pi*a*r);
		sc.close();
	}

}
