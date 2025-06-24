package Assignments;

import java.util.Scanner;

//WAP to print Area of Square using Scanner Class
public class Assignment29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter One side value :");
		double a = sc.nextDouble();
		System.out.println("Area of Square is :"+a*a);
		sc.close();
		
	}

}
