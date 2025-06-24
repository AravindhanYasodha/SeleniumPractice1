package Assignments.InheritanceConcepts;
//WAP to check if the given string is a Palindrome?
import java.util.Scanner;

public class Assignment71 {

	
	public static void ReverseString() {
		System.out.println("Enter Input : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String reversed = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			reversed += input.charAt(i);
		}
		System.out.println("Reversed input is : " + reversed);
		if(input.equals(reversed)) {
			System.out.println("it is a Palidrome");
		}else {
			System.out.println("It is Not a Palindrome");
		}
	}


	public static void main(String[] args) {
		ReverseString();
	}
	
}
