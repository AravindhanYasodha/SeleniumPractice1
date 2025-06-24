package Assignments.InheritanceConcepts;
//WAP to find out if the given 2 strings are anagram                
import java.util.Arrays;
import java.util.Scanner;

public class Assignment82 {

	public static void FindAnagram() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter First Input:");
		String input1 = sc1.next();
		int length1 = input1.length();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Second Input:");
		String input2 = sc2.next();
		int length2 = input2.length();

		char[] array1 = input1.toCharArray();
		Arrays.sort(array1);

		char[] array2 = input2.toCharArray();
		Arrays.sort(array2);

		if (length1 == length2) {
			boolean arrayeqals = Arrays.equals(array1, array2);
			if (arrayeqals == true) {
				System.out.println("It is An Anagram");
			} else {
				System.out.println("it is Not An Anagram");
			}
		} else {
			System.out.println("It is Not An Anagram");
		}

	}

	public static void main(String[] args) {
		FindAnagram();
	}

}
