package Assignments.InheritanceConcepts;
//WAP on String Buffer using Append, insert, delete, substring, reverse, Capacity, replace
public class Assignment86 {

	public static void main(String[] args) {
		// Creating a StringBuffer object
		StringBuffer sb = new StringBuffer("Hello, Aravind!");

		// Append - Adds text at the end
		sb.append(" Welcome to Java.");
		System.out.println("After append(): " + sb);

		// Insert - Inserts text at a specific index
		sb.insert(7, "Mr ");
		System.out.println("After insert(): " + sb);

		// Delete - Removes characters from a specific range
		sb.delete(7, 10);
		System.out.println("After delete(): " + sb);

		// Substring - Extracts part of the string
		String subText = sb.substring(7, 14);
		System.out.println("Substring result: " + subText);

		// Reverse - Reverses the string
		sb.reverse();
		System.out.println("After reverse(): " + sb);

		// Capacity - Displays the current capacity of the buffer
		System.out.println("Buffer capacity: " + sb.capacity());

		// Replace - Replaces characters in a specific range
		sb.reverse(); // Reversing back to original order
		sb.replace(7, 14, "Unknown");
		System.out.println("After replace(): " + sb);
	}
}
