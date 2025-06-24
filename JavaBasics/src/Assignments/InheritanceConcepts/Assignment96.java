package Assignments.InheritanceConcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//WAP to iterate a Set using Iterator
public class Assignment96 {

	public static void main(String[] args) {
		// Creating a Set
		Set<String> names = new HashSet<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		// Getting the Iterator
		Iterator<String> iterator = names.iterator();

		// Iterating through the Set
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}