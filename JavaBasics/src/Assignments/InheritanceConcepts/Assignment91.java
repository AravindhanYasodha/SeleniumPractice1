package Assignments.InheritanceConcepts;
// WAP to iterate a Collection using Iterator 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment91 {

	public static void main(String[] args) {
		// Creating a List (Collection)
		List<String> items = new ArrayList<>();
		items.add("Apple");
		items.add("Banana");
		items.add("Cherry");

		// Getting the iterator
		Iterator<String> iterator = items.iterator();

		// Iterating through the collection
		while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
	}
}
