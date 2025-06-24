package Assignments;

import java.util.Scanner;

//WAP to print Area of Circle using Scanner Class
public class Assignment25 {

	public static void main(String[] args) {

		double pi = Math.PI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius value : ");
		double r = sc.nextDouble();
		System.out.println("Area of Circle is :"+pi*r*r);
		sc.close();
	}

}
