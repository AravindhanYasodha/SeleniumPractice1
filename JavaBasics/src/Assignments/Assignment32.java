package Assignments;

import java.util.Scanner;

//WAP to print Circumference of Rectangle using Scanner Class
public class Assignment32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Breath :");
		double b = sc.nextDouble();
		System.out.println("Enter Height :");
		double h = sc.nextDouble();
		System.out.println("Circumference of Rectangle is :"+(2*(b+h)));
		sc.close();

	}

}
