package Assignments.InheritanceConcepts;
//WAP to copy one array into another array in reverse order
import java.util.Arrays;

public class Assignment79 {

	public static void main(String[] args) {
		// Original array
		int[] original = { 10, 20, 30, 40, 50 };

		// Creating a new array of the same size
		int[] reversed = new int[original.length];

		// Copying elements in reverse order
		for (int i = original.length - 1; i >= 0; i--) {
			reversed[i] = original[original.length - 1 - i];
		}

		// Printing the reversed array
		System.out.println("Original Array: " + Arrays.toString(original));
		System.out.println("Reversed Array: " + Arrays.toString(reversed));
	}
}
