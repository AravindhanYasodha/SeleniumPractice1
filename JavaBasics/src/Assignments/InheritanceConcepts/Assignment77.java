package Assignments.InheritanceConcepts;
//WAP to check if 2 arrays are equals to each other at run time
import java.util.Scanner;

public class Assignment77 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Taking input for first input1
		System.out.print("Enter size of first input1: ");
		int size1 = scanner.nextInt();
		int[] input1 = new int[size1];
		System.out.println("Enter elements of first input1:");
		for (int i = 0; i < size1; i++) {
			input1[i] = scanner.nextInt();
		}

		// Taking input for second input2
		System.out.print("Enter size of second input2: ");
		int size2 = scanner.nextInt();
		int[] input2 = new int[size2];
		System.out.println("Enter elements of second input2:");
		for (int i = 0; i < size2; i++) {
			input2[i] = scanner.nextInt();
		}

		// Manual comparison
		boolean manualCheck = true;
		if (size1 != size2) {
			manualCheck = false;
		} else {
			for (int i = 0; i < size1; i++) {
				if (input1[i] != input2[i]) {
					manualCheck = false;
					break;
				}
			}
		}
		System.out.println("Arrays are equal (manual comparison): " + manualCheck);

		scanner.close();
	}
}
