package Assignments.InheritanceConcepts;
//WAP to reverse a string
import java.util.Scanner;

public class Assignment70 {

	public static void ReverseString() {
		System.out.println("Enter Input : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String reversed = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			reversed += input.charAt(i);
		}
		System.out.println("Reversed input is : " + reversed);
	}

	public static void ReverseString1() {
		System.out.println("Enter Input : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] words = input.split(" ");
		String reversed = "";
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			reversed += sb.reverse().toString() + " ";
		}
		System.out.println("Reversed input is : "+reversed);

	}

	public static void main(String[] args) {
		ReverseString();
		ReverseString1();
	}
}
