package Assignments.InheritanceConcepts;

//WAP to iterate a List using Iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment93 {

	public static void main(String[] args) {
		// Creating a List
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		// Getting the Iterator
		Iterator<String> iterator = names.iterator();

		// Iterating through the List
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
	}

}