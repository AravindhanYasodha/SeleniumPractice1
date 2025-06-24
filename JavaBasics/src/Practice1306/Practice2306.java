package Practice1306;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice2306 {

	public static void ReverseString(String input) {

		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		System.out.println(reversed);
	}

	public static void ReverseStringWOChange(String input) {
		String reversed = "";
		String[] stg = input.split(" ");
		for (String value : stg) {
			for (int i = value.length() - 1; i >= 0; i--) {
				reversed += value.charAt(i);
			}
			reversed += " ";
		}
		System.out.println(reversed.trim());
	}

	public static void RemoveSpicalChar(String input) {
		String replaced = input.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(replaced);
	}

	public static void FindAnagram(String input1, String input2) {
		String stg1 = input1.toLowerCase();
		String stg2 = input2.toLowerCase();

		char[] arr1 = stg1.toCharArray();
		char[] arr2 = stg2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("It is a Anagram");
		} else {
			System.out.println("It is not a Anagram");
		}
	}

	public static void FindPalindrome(String input) {
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		if (reversed.equalsIgnoreCase(input)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not a Plindrome");
		}
	}

	public static void CountOccurence(String input) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);

	}

	public static void CoundAndPrintNumCharSpace(String input) {
		int aphabetCount = 0;
		int digitCount = 0;
		int whitespaceCount = 0;
		int specialcharCount = 0;

		char[] ch = input.toCharArray();

		for (char c : ch) {
			if (Character.isAlphabetic(c)) {
				aphabetCount++;
			} else if (Character.isDigit(c)) {
				digitCount++;
			} else if (Character.isWhitespace(c)) {
				whitespaceCount++;
			} else {
				specialcharCount++;
			}
		}

		System.out.println("Total Alphabet is : " + aphabetCount);
		System.out.println("Total Digit is : " + digitCount);
		System.out.println("Total WhiteSpace is : " + whitespaceCount);
		System.out.println("Total Special Char is : " + specialcharCount);
	}

	public static void FindMinMidMax() {
		int[] arr = { 33, 6, 8, 22, 66, 99 };
		Arrays.sort(arr);

		int min = arr[0];
		int mid = arr[arr.length / 2 - 1];
		int max = arr[arr.length - 1];

		System.out.println("Maximum is : " + max + ", Mid is : " + mid + ", Minimum is : " + min);
	}

	public static void DivisibleBy10(int length) {

		for (int i = 1; i < length; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void FindNearestValue(int givenValue) {

		int[] arr = { 33, 44, 66, 22, 99, 55 };
		Arrays.sort(arr);
		int firstValue = arr[0];
		for (int i : arr) {
			if (Math.abs(i - givenValue) < Math.abs(firstValue - givenValue)) {
				firstValue = i;
			}
		}
		System.out.println("Nearest Value of " + givenValue + " : " + firstValue);
	}

	public static void RemoveStringDuplicates() {
		String input = "rrtteeuuss";

		char[] ch = input.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (char c : ch) {
			set.add(c);
		}
		System.out.println(set);
	}

	public static void RemoveIntegerDuplicates() {
		int[] input = { 1, 1, 4, 5, 6, 4, 5, 6, 7, 7 };

		Set<Integer> set = new HashSet<Integer>();
		for (int i : input) {
			set.add(i);
		}
		System.out.println(set);
	}

	public static void SwappingWithOut() {
		int a = 10;
		int b = 8;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
	}

	public static void SwappingWithOut1() {

		int a = 10;
		int b = 8;
		int c = 7;

		a = a + b + c;
		b = a - (b + c);
		c = a - (b + c);
		a = a - (b + c);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void SwappingWith() {

		int a = 10;
		int b = 12;
		int c;

		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	}

	public static void SwappingWith1() {

		int a = 10;
		int b = 11;
		int c = 12;
		int d;

		d = a;
		a = b;
		b = c;
		c = d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void PrintStar(int length) {

		for (int i = length; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void FibonacciMultiplicationSerie(int length) {

		int first = 1;
		int second = 2;
		for (int i = 0; i <= length; i++) {
			System.out.print(first + " ");
			int third = first * second;
			first = second;
			second = third;
		}
	}

	public static void FibonacciAdditionSerie(int length) {

		int first = 1;
		int second = 2;
		for (int i = 0; i <= length; i++) {
			System.out.print(first + " ");
			int third = first + second;
			first = second;
			second = third;
		}
	}

	public static void FindPrimeNumber() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int a : arr) {
			if (a % 2 == 0) {
				System.out.println(a + " : Its Not a Prime Number");
			} else {
				System.out.println(a + " : It a Prime Number");
			}
		}
	}

	public static void main(String[] args) {
//		ReverseString("Aravindhan");
//		ReverseStringWOChange("Aravindhan Ravi");
//		RemoveSpicalChar("@ravind£an33");
//		FindAnagram("care", "Race");
//		FindPalindrome("Madam");
//		CountOccurence("Aravindhan Ravi");
//		CoundAndPrintNumCharSpace("32414dvasds  asd£$%^");
//		FindMinMidMax();
//		DivisibleBy10(33);
//		FindNearestValue(50);
//		RemoveStringDuplicates();
//		RemoveIntegerDuplicates();
//		SwappingWithOut();
//		SwappingWithOut1();
//		SwappingWith();
//		SwappingWith1();
//		PrintStar(10);
//		FibonacciMultiplicationSerie(10);
//		FibonacciAdditionSerie(10);
//		FindPrimeNumber();
	}

}
