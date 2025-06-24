package Assignments.InheritanceConcepts;
//WAP on Array Function using Arrays.toString and Arrays.sort concept
import java.util.Arrays;

public class Assignment80 {

	public static void main(String[] args) {
		// Define an array of numbers
		int[] numbers = { 50, 10, 30, 20, 40 };

		// Printing original array
		System.out.println("Original Array: " + Arrays.toString(numbers));

		// Sorting the array
		Arrays.sort(numbers);

		// Printing sorted array
		System.out.println("Sorted Array: " + Arrays.toString(numbers));
	}
}
