package Assignments.InheritanceConcepts;
//WAP to sort List
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment97 {

	public static void main(String[] args) {
		// Creating a List
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(9);
		numbers.add(1);
		numbers.add(6);

		// Sorting the List in ascending order
		Collections.sort(numbers);
		System.out.println("Sorted List (Ascending): " + numbers);

		// Sorting the List in descending order
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("Sorted List (Descending): " + numbers);
	}
}