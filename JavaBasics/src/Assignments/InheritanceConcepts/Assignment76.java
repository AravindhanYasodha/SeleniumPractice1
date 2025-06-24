package Assignments.InheritanceConcepts;
//WAP to accept the values of your array at run time
import java.util.Scanner;

public class Assignment76 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter size of first array: ");
		int size1 = scanner.nextInt();

		int[] input = new int[size1];
		System.out.println("Enter elements of first array:");
		for (int i = 0; i < size1; i++) {
			input[i] = scanner.nextInt();
		}

		int sum = 0;
		for (int num : input) {
			sum += num;
		}

		double average = (double) sum / input.length;
		System.out.println("Average value is : " + average);
	}

}
