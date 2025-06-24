package Assignments.InheritanceConcepts;
//WAP on List concepts using its methods
import java.util.ArrayList;
import java.util.List;

public class Assignment92 {

	public static void main(String[] args) {
		// Creating a List
		List<String> fruits = new ArrayList<>();

		// Adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Mango");

		// Accessing an element
		System.out.println("First fruit: " + fruits.get(0)); // Gets first element

		// Modifying an element
		fruits.set(1, "Blueberry"); // Replaces "Banana" with "Blueberry"

		// Removing an element
		fruits.remove("Cherry"); // Removes "Cherry"

		// Checking if an element exists
		System.out.println("Contains Mango? " + fruits.contains("Mango"));

		// Finding the size of the List
		System.out.println("Size of list: " + fruits.size());

		// Iterating using a for-each loop
		System.out.println("List elements:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Clearing the List
		fruits.clear();
		System.out.println("List after clearing: " + fruits);
	}
}