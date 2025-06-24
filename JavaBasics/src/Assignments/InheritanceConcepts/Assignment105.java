package Assignments.InheritanceConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//"WAP to iterate a MAP using Iterator"
public class Assignment105 {

	public static void main(String[] args) {
		// Creating a Map
		Map<Integer, String> accountMap = new HashMap<>();
		accountMap.put(101, "Aravindhan");
		accountMap.put(102, "Ravi");
		accountMap.put(103, "Guna");

		// Getting the Iterator
		Iterator<Map.Entry<Integer, String>> iterator = accountMap.entrySet().iterator();

		// Iterating through the Map using Iterator
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Account Number: " + entry.getKey() + ", Account Holder: " + entry.getValue());
		}
	}
}
