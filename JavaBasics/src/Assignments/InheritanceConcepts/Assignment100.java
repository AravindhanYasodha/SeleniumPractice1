package Assignments.InheritanceConcepts;

import java.util.Enumeration;
import java.util.Hashtable;

//WAP on Enumeration
public class Assignment100 {

	public static void main(String[] args) {
		// Creating a Hashtable
		Hashtable<Integer, String> studentMap = new Hashtable<>();
		studentMap.put(1, "Alice");
		studentMap.put(2, "Bob");
		studentMap.put(3, "Charlie");

		// Getting the Enumeration
		Enumeration<Integer> enumeration = studentMap.keys();

		// Iterating through the Hashtable using Enumeration
		System.out.println("Iterating through Hashtable using Enumeration:");
		while (enumeration.hasMoreElements()) {
			Integer key = enumeration.nextElement();
			System.out.println("Student ID: " + key + ", Name: " + studentMap.get(key));
		}
	}
}
