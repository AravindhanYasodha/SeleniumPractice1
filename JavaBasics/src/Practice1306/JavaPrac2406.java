package Practice1306;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaPrac2406 {

	public static void ReverseString(String input) {

		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		System.out.println(reversed);
	}

	public static void ReverseStringWOChange(String input) {
		String reversed = "";
		String[] words = input.split(" ");
		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				reversed += word.charAt(i);
			}
			reversed += " ";
		}
		System.out.println(reversed.trim());
	}

	public static void RemoveSpicalChar(String input) {

		String replaced = input.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaced);
	}

	public static void FindAnagram(String input1, String input2) {

		String stg1 = input1.toLowerCase();
		String stg2 = input2.toLowerCase();

		char[] ch1 = stg1.toCharArray();
		char[] ch2 = stg2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
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
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("It is not a Palindrome");
		}
	}

	public static void CountOccurence(String input) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = input.toCharArray();
		for (char ch : arr) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);

	}

	public static void CoundAndPrintNumCharSpace(String input) {

		int aphabet = 0;
		int numeric = 0;
		int space = 0;
		int special = 0;

		char[] arr = input.toCharArray();
		for (char ch : arr) {
			if (Character.isAlphabetic(ch)) {
				aphabet++;
			} else if (Character.isDigit(ch)) {
				numeric++;
			} else if (Character.isWhitespace(ch)) {
				space++;
			} else {
				special++;
			}
		}
		System.out.println(aphabet);
		System.out.println(numeric);
		System.out.println(space);
		System.out.println(special);
	}

	public static void FindMinMidMax() {
		int[] arr = { 23, 453, 654, 867, 342, 75, 32, 32 };
		Arrays.sort(arr);
		int min = arr[0];
		int mid = arr[arr.length / 2 - 1];
		int max = arr[arr.length - 1];
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
	}

	public static void DivisibleBy10(int length) {

		for (int i = 1; i <= length; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void FindNearestValue(int givenValue) {
		int[] arr = { 1, 2, 5, 6, 7, 8, 3 };
		Arrays.sort(arr);
		int nearestValue = arr[0];
		for (int i : arr) {
			if (Math.abs(i - givenValue) < Math.abs(nearestValue - givenValue)) {
				nearestValue = i;
			}
		}
		System.out.println(nearestValue);
	}

	public static void RemoveDuplicates() {
		String stg = "ddffrrttkkff";
		char[] arr = stg.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (char ch : arr) {
			set.add(ch);
		}
		System.out.println(set);
	}

	public static void SwappingWithOut1() {
		int a = 19;
		int b = 33;
		int c = 44;

		a = a + b + c;
		b = a - (b + c);
		c = a - (b + c);
		a = a - (b + c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void SwappingWith1() {
		int a = 19;
		int b = 33;
		int c = 44;
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

//		for(int i=length; i>=0; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//		}
//		System.out.println();
	}

	public static void FibonacciAdditionSerie(int length) {

		int first = 1;
		int second = 2;
		for (int i = 0; i <= length; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
	}

	public static void FindPrimeNumber() {

		int[] arr = { 3, 5, 6, 8, 9, 2 };
		for (int a : arr) {

			for (int i = 2; i <= arr.length; i++) {
				if (a % 2 == 0) {
					System.out.println(a + " : is not a Prime number");
					break;
				} else {
					System.out.println(a + " : is prime Number");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
//		ReverseString("Aravindhan");
//		ReverseStringWOChange("Aravindhan Ravi");
//		RemoveSpicalChar("@ravind£an33");
//		FindAnagram("care", "Racee");
//		FindPalindrome("Mada");
//		CountOccurence("Aravindhan Ravi");
//		CoundAndPrintNumCharSpace("32414dvasds  asd£$%^");
//		FindMinMidMax();
//		DivisibleBy10(33);
//		FindNearestValue(4);
//		RemoveDuplicates();
//		SwappingWithOut();
//		SwappingWithOut1();
//		SwappingWith();
//		SwappingWith1();
//		PrintStar(10);
//		FibonacciMultiplicationSerie(10);
//		FibonacciAdditionSerie(10);
		FindPrimeNumber();
	}

}
