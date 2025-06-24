package Assignments.InheritanceConcepts;
//WAP to copy one array into another array
import java.util.Arrays;

public class Assignment78 {

	public static void Method1() {
		int[] original = { 10, 20, 30, 40, 50 };

		// Using Arrays.copyOf()
		int[] copy = Arrays.copyOf(original, original.length);

		System.out.println("Copied Array: " + Arrays.toString(copy));
	}

	public static void Method2() {
		int[] original = { 10, 20, 30, 40, 50 };
		int[] copy = new int[original.length];

		for (int i = 0; i < original.length; i++) {
			copy[i] = original[i];
		}

		// Printing copied array
		System.out.print("Copied Array: ");
		for (int num : copy) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		Method1();
		Method2();
	}
}
