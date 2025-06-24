package Assignments;

import java.util.Scanner;

// WAP to check person can vote only if he/she is 18 or above and should not vote if age is less.
public class Assignment10 {

	static void gendercheck() {
		
		String gender = "Male";
		
		switch(gender) {
		case "Male":
			System.out.println("Male Candidate");
			break;
		case "Female":
			System.out.println("Female Candidate");
			break;
			default:
				System.out.println("Unknown Gender");
		}
	}
	
	static void agecheck() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("Eligible for Voting");
		}else {
			System.out.println("Not eligible for voting");
		}
		sc.close();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gendercheck();
		agecheck();
	}

}
