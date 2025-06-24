package Assignments.InheritanceConcepts;
//WAP on collection concept with the help of Upcasting on Different Data types (Int, Char, Double, string etc.) with different methods like Add, Remove, Contains.
import java.util.ArrayList;
import java.util.List;

public class Assignment89 {

	public static void main(String[] args) {
		// Using List with Upcasting (Object type)
		List<Object> collection = new ArrayList<>();

		// Adding different data types
		collection.add(10); // Integer
		collection.add('A'); // Character
		collection.add(25.5); // Double
		collection.add("Aravindhan"); // String

		// Displaying the collection
		System.out.println("Collection: " + collection);

		// Checking if an element exists
		System.out.println("Contains 'A'? " + collection.contains('A'));
		System.out.println("Contains 100? " + collection.contains(100));

		// Removing an element
		collection.remove(25.5);
		System.out.println("After removing 25.5: " + collection);
	}
}