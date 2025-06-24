package Assignments.InheritanceConcepts;
//WAP to iterate a List using List iterator
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment94 {

	public static void main(String[] args) {
		// Creating a List
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		// Getting the ListIterator
		ListIterator<String> listIterator = names.listIterator();

		// Iterating forward
		System.out.println("Forward iteration:");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		// Iterating backward
		System.out.println("Backward iteration:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}
}