package Assignments.InheritanceConcepts;

import java.util.Arrays;

//WAP on arrayindexoutofbounds expection with a try catch
public class Assignment81 {

	public static void main(String[] args) {
		// Original array
		int[] original = { 10, 20, 30, 40, 50 };

		// Creating a new array of the same size
		int[] reversed = new int[original.length];
		try {
		// Copying elements in reverse order
		for (int i = original.length; i >= 0; i--) {
			reversed[i] = original[original.length - 1 - i];
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Catched");
		}
		// Printing the reversed array
		System.out.println("Original Array: " + Arrays.toString(original));
		System.out.println("Reversed Array: " + Arrays.toString(reversed));
	}
	
}
