package Assignments.InheritanceConcepts;

import java.util.HashMap;
import java.util.Map;

//WAP on MAP using methods like get(), containsKey(), containsValue(), putIfAbsent(), equals()
public class Assignment101 {

	public static void main(String[] args) {
		// Creating two Maps
		Map<Integer, String> accountMap1 = new HashMap<>();
		Map<Integer, String> accountMap2 = new HashMap<>();

		// Adding key-value pairs
		accountMap1.put(101, "Alice");
		accountMap1.put(102, "Bob");
		accountMap1.put(103, "Charlie");

		accountMap2.put(101, "Alice");
		accountMap2.put(102, "Bob");
		accountMap2.put(103, "Charlie");

		// Using get() method
		System.out.println("Account Holder for 102: " + accountMap1.get(102));

		// Using containsKey() method
		System.out.println("Contains key 101? " + accountMap1.containsKey(101));

		// Using containsValue() method
		System.out.println("Contains value 'Charlie'? " + accountMap1.containsValue("Charlie"));

		// Using putIfAbsent() method
		accountMap1.putIfAbsent(104, "David");
		System.out.println("Updated Map: " + accountMap1);

		// Using equals() method to compare two maps
		System.out.println("Are both maps equal? " + accountMap1.equals(accountMap2));
	}
}
