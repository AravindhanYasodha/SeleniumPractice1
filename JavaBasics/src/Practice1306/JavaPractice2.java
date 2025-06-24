package Practice1306;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class JavaPractice2 {

	public static void ReverseString(String input) {
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) { // 4
			reversed += input.charAt(i);
		}
		System.out.println(reversed);
		System.out.println("===========================");
	}

	public static void ReverseStringWOChange(String input) {
		String reversed = "";
		String[] splited = input.split(" ");
		for (String word : splited) {
			for (int i = word.length() - 1; i >= 0; i--) {
				reversed += word.charAt(i);
			}
			reversed += " ";
		}
		System.out.println(reversed);
		System.out.println("===========================");
	}

	public static void RemoveSpicalChar(String input) {
		String replaced = input.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(replaced);
		System.out.println("===========================");
	}

	public static void FindAnagram(String input1, String input2) {
		int size1 = input1.length();
		int size2 = input2.length();

		String stg1 = input1.toLowerCase();
		String stg2 = input2.toLowerCase();

		char[] arr1 = stg1.toCharArray();
		char[] arr2 = stg2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		String sortedstg1 = new String(arr1);
		String sortedstg2 = new String(arr2);

		if (size1 == size2) {
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("It is a Anagram : " + sortedstg1 + ", " + sortedstg2);
			} else {
				System.out.println("It is not a Anagram : " + sortedstg1 + ", " + sortedstg2);
			}
		} else {
			System.out.println("It is not a Anagram : " + sortedstg1 + ", " + sortedstg2);
		}
		System.out.println("===========================");
	}

	public static void FindPalindrome(String input) {
		String reversed = "";
		String lowinput = input.toLowerCase();
		for (int i = lowinput.length() - 1; i >= 0; i--) {
			reversed += lowinput.charAt(i);
		}
		if (reversed.equals(lowinput)) {
			System.out.println("Its a Palidrome");
		} else {
			System.out.println("Its not a Palindrome");
		}
		System.out.println("===========================");
	}

	public static void CountOccurence(String input) {
		char[] arr = input.toCharArray();
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (char ch : arr) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);
		System.out.println("===========================");
	}

	public static void CoundAndPrintNumCharSpace(String input) {

		int isAlphabetic = 0;
		int isDigit = 0;
		int isWhitespace = 0;
		int isSpecial = 0;

		char[] ch = input.toCharArray();
		for (char c : ch) {
			if (Character.isAlphabetic(c)) {
				isAlphabetic++;
			} else if (Character.isDigit(c)) {
				isDigit++;
			} else if (Character.isWhitespace(c)) {
				isWhitespace++;
			} else {
				isSpecial++;
			}
		}
		System.out.println("Count of Alphabet : " + isAlphabetic);
		System.out.println("Count of Digit : " + isDigit);
		System.out.println("Count of Whitespace : " + isWhitespace);
		System.out.println("Count of Special : " + isSpecial);
		System.out.println("===========================");
	}

	public static void FindMinMidMax() {

		int[] arr = { 23, 77, 33, 56, 101, 54, 11 };

		Arrays.sort(arr);

		int min = arr[0];
		int mid = arr[arr.length / 2 - 1];
		int max = arr[arr.length - 1];

		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
		System.out.println("===========================");
	}

	public static void DivisibleBy10(int input) {
		for (int i = 0; i <= input; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("===========================");
	}

	public static void FindNearestValue(int input) {

		int[] arr = { 10, 30, 40, 60, 20, 1 };

		Arrays.sort(arr);

		int firstvalue = arr[0];

		for (int arr1 : arr) {
			if (Math.abs(arr1 - input) < Math.abs(firstvalue - input)) {
				firstvalue = arr1;
			}
		}
		System.out.println("The Nearest value is : " + firstvalue);
		System.out.println("===========================");
	}

	public static void RemoveDuplicates() {

		int[] arr = { 22, 55, 88, 22, 33, 44, 00, 11, 55 };

		Set<Integer> set = new HashSet<Integer>();
		for (int a : arr) {
			set.add(a);
		}
		System.out.println(set);
		System.out.println("===========================");
	}

	public static void SwappingWithOut() {

		int a = 10;
		int b = 20;
		int c = 30;

		a = a + b + c;// 10+20+30=60
		b = a - (b + c);// 60-(20+30)=10
		c = a - (b + c);// 60-(10+30)=20
		a = a - (b + c);// 60-(20+10)=30
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("===========================");
	}

	public static void SwappingWithOut1() {
		int a = 10;
		int b = 20;

		a = a ^ b;
		b = a ^ b;
		a = b ^ a;

		System.out.println(a);
		System.out.println(b);
		System.out.println("===========================");
	}

	public static void SwappingWith() {
		int a = 10;
		int b = 20;
		int c;

		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
		System.out.println("===========================");

	}

	public static void SwappingWith1() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d;

		d = a;
		a = b;
		b = c;
		c = d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("===========================");

	}

	public static void PrintStar(int input) {

		for (int i = input; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===========================");
	}

	public static void FibonacciAddition(int input) {

		int first = 1;
		int second = 2;
		System.out.print("Fibonacci Addition : ");
		for (int i = input; i >= 0; i--) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
		System.out.println();
		System.out.println("===========================");
	}

	public static void FibonacciMultiple(long input) {

		int first = 1;
		int second = 2;
		System.out.print("Fibonacci Multiple : ");
		for (int i = 0; i <= input; i++) {
			System.out.print(first + " ");
			int third = first * second;
			first = second;
			second = third;
		}
		System.out.println();
		System.out.println("===========================");
	}

	public static void main(String[] args) {
//		ReverseString("Aravindhan Ravi");
//		ReverseStringWOChange("Aravindhan Ravi");
//		RemoveSpicalChar("@ravind£an33");
//		FindAnagram("care", "race");
//		FindPalindrome("dasfd");
//		CountOccurence("Aravindhan Ravi");
//		CoundAndPrintNumCharSpace("32414dvasds  asd£$%^");
//		FindMinMidMax();
//		DivisibleBy10(33);
//		FindNearestValue(5);
//		RemoveDuplicates();
//		SwappingWithOut();
//		SwappingWithOut1();
//		SwappingWith();
//		SwappingWith1();
//		PrintStar(10);
//		FibonacciAddition(10);
//		FibonacciMultiple(10);
	}
}
