package Assignments.InheritanceConcepts;
//WAP on Set concepts using its methods
import java.util.HashSet;
import java.util.Set;
public class Assignment95 {

	public static void main(String[] args) {
		// Creating a Set
		Set<String> fruits = new HashSet<>();

		// Adding elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Mango");

		// Attempting to add a duplicate element
		fruits.add("Apple"); // Won't be added since Set doesn't allow duplicates

		// Checking if an element exists
		System.out.println("Contains Mango? " + fruits.contains("Mango"));

		// Removing an element
		fruits.remove("Cherry");

		// Finding the size of the Set
		System.out.println("Size of set: " + fruits.size());

		// Iterating using a for-each loop
		System.out.println("Set elements:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Clearing the Set
		fruits.clear();
		System.out.println("Set after clearing: " + fruits);
		
		System.out.println("Set prints Random order");
	}
}
