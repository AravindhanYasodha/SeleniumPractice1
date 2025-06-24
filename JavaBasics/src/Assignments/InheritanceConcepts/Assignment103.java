package Assignments.InheritanceConcepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//WAP to fetch all the values present in map
public class Assignment103 {

	public static void main(String[] args) {
		// Creating a Map
		Map<Integer, String> accountMap = new HashMap<>();
		accountMap.put(101, "Aravind");
		accountMap.put(102, "Ravi");
		accountMap.put(103, "Guna");
		accountMap.put(103, "Paaroli");

		// Fetching all values using Collections<> values
		Collection<String> values = accountMap.values();

		// Displaying values
		System.out.println("Values present in the Map: " + values);
	}

}
