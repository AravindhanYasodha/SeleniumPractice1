package Assignments.InheritanceConcepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//WAP to fetch both keys&values present in map
public class Assignment104 {

	public static void main(String[] args) {
		// Creating a Map
		Map<Integer, String> accountMap = new HashMap<>();
		accountMap.put(101, "Aravind");
		accountMap.put(102, "Ravi");
		accountMap.put(103, "Guna");
		accountMap.put(103, "Paaroli");

		// Fetching all keys using keySet()
		Set<Integer> keys = accountMap.keySet();
		// Fetching all values using Collection<> values
		Collection<String> values = accountMap.values();

		// Displaying keys
		System.out.println("Keys present in the Map: " + keys);
		// Displaying values
		System.out.println("Values present in the Map: " + values);
	}
}
