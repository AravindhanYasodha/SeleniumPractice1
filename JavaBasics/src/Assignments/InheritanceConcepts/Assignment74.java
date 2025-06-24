package Assignments.InheritanceConcepts;

import java.util.Scanner;

//WAP to pass anything at Runtime using args variable in the main method
public class Assignment74 {

	public static void Method1(String input) {

		char[] charArray = input.toCharArray();
		String reversed = "";
		System.out.print("Reversed string: ");
		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed += charArray[i];
		}
		System.out.println(reversed);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String value : ");
		String input = sc.nextLine();
		Method1(input);
		System.out.println("Runtime Argument passed in main method variable : " + input);

	}

}
