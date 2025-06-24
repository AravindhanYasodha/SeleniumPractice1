package Assignments;

import java.util.Scanner;

//WAP to print Circumference of Triangle using Scanner Class
public class Assignment28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Left side LH value :");
		double lh = sc.nextDouble();
		System.out.println("Enter Right Side RH value :");
		double rh = sc.nextDouble();
		System.out.println("Enter Bottom Line BT value :");
		double bt = sc.nextDouble();
		
		System.out.println("Circumference of Triangle is : "+(lh+rh+bt));
		sc.close();

	}

}
