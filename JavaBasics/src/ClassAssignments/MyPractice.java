package ClassAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyPractice {

	static void reverseString() {

		String str = "Welcome to Country";

		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverseStr += str.charAt(i);

		}
		System.out.println(reverseStr);

	}

	static void reverseStringWOChangingPlace() {

		String str = "Welcome to Country";

		String reverseStr = "";

		String[] words = str.split(" ");

		for (String word : words) {

			StringBuilder sb = new StringBuilder(word);

			reverseStr += sb.reverse().toString() + " ";

		}
		System.out.println(reverseStr);

	}

	static void removeSpecialChart() {

		String stg = "£uck $iila £$%£dfgerg";

		String replaced = stg.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(replaced);

	}

	static void removeDuplicates() {

		int[] arr = { 22, 44, 55, 33, 22, 66, 77, 66, 33 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		

		Set<Integer> set = new HashSet<>();

		for (int arr1 : arr) {

			set.add(arr1);

		}
		Set<Integer> setorder = new TreeSet<>(set);
		System.out.println(setorder);
	}

	public static void numeratorDinominator() {

		int a = 15;

		if (a % 2 == 0) {

			System.out.println("1");

		} else {
			System.out.println("2");
		}
	}

	public static void ReverseSortArrayString() {

		// aravind,jp,mani,arun,naveen

		String[] arr = { "aravind", "jp", "mani", "arun", "mani", "naveen" };

		System.out.println(Arrays.toString(arr));

		ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
		Collections.sort(arrList);
		System.out.println(arrList);
		Collections.reverse(arrList);
		System.out.println(arrList);
		Set<String> removeDuplicate = new HashSet<>(arrList);
		System.out.println(removeDuplicate);

	}

	public static void main(String[] args) {

		reverseString();
		reverseStringWOChangingPlace();
		removeSpecialChart();
		removeDuplicates();
		numeratorDinominator();
		ReverseSortArrayString();
	}

}
