package Assignments;

import java.util.Scanner;

//WAP to print Circumference of Square using Scanner Class
public class Assignment30 {

	public static void main(String[] args) {
		
		int sides = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter One side value :");
		double a = sc.nextDouble();
		System.out.println("Circumference of Square is :"+sides*a);
		sc.close();

	}

}
