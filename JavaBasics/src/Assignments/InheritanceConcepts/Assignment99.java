package Assignments.InheritanceConcepts;

import java.util.HashMap;
import java.util.Map;

//WAP on MAP concepts using its methods
public class Assignment99 {

	public static void main(String[] args) {
		// Creating a Map
		Map<Integer, String> accountMap = new HashMap<>();

		// Adding key-value pairs
		accountMap.put(101, "Alice");
		accountMap.put(102, "Bob");
		accountMap.put(103, "Charlie");

		// Accessing a value using a key
		System.out.println("Account Holder for 102: " + accountMap.get(102));

		// Checking if a key exists
		System.out.println("Contains key 101? " + accountMap.containsKey(101));

		// Checking if a value exists
		System.out.println("Contains value 'Charlie'? " + accountMap.containsValue("Charlie"));

		// Removing a key-value pair
		accountMap.remove(103);

		// Finding the size of the Map
		System.out.println("Size of Map: " + accountMap.size());

		// Iterating through the Map using entrySet
		System.out.println("Account Details:");
		for (Map.Entry<Integer, String> entry : accountMap.entrySet()) {
			System.out.println("Account Number: " + entry.getKey() + ", Account Holder: " + entry.getValue());
		}

		// Clearing the Map
		accountMap.clear();
		System.out.println("Map after clearing: " + accountMap);
	}
}
