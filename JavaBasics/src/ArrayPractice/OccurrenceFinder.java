package ArrayPractice;

import java.util.HashMap;

public class OccurrenceFinder {

	// Method to find occurrences in an integer array
	public static void findIntegerOccurrences(int[] array) {
		HashMap<Integer, Integer> occurrenceMap = new HashMap<>();

		for (int num : array) {
			occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
		}

		System.out.println("Occurrences in integer array: " + occurrenceMap);
	}

	// Method to find occurrences in a string array
	public static void findStringOccurrences(String[] array) {
		HashMap<String, Integer> occurrenceMap = new HashMap<>();

		for (String str : array) {
			occurrenceMap.put(str, occurrenceMap.getOrDefault(str, 0) + 1);
		}

		System.out.println("Occurrences in string array: " + occurrenceMap);
	}

	static void findStringOccurance1() {

		String stg = "Aravindhan Ravi";
		String stg1 = stg.toLowerCase();

		char[] words = stg1.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char word : words) {

			map.put(word, map.getOrDefault(word, 0) + 1);

		}
		System.out.println(map);

	}

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 2, 4, 5, 1 };
		String[] stringArray = { "apple", "banana", "apple", "cherry", "banana", "cherry", "apple" };

		findIntegerOccurrences(intArray);
		findStringOccurrences(stringArray);
		findStringOccurance1();
	}
}
