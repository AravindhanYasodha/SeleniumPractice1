package Assignments;

import java.util.Scanner;

//WAP to print Area of Rectangle using Scanner Class
public class Assignment31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height :");
		double h = sc.nextDouble();
		System.out.println("Enter Breath :");
		double b = sc.nextDouble();
		System.out.println("Area of Rectangle is :"+b*h);
		sc.close();

	}

}
