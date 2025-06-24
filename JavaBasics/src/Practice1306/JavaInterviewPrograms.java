package Practice1306;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaInterviewPrograms {

	public static void ReverseString(String input) {

		String reversed = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		System.out.println(reversed);
		System.out.println("======================================");
	}

	public static void ReverseStringWOChange(String input) {
		String[] words = input.split(" ");
		String reversed = " ";
		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				reversed += word.charAt(i);
			}
			reversed += " ";
		}
		System.out.println(reversed.trim());
		System.out.println("======================================");
	}

	public static void RemoveSpicalChar(String input) {

		String replaced = input.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replaced);
		System.out.println("======================================");
	}

	public static void FindAnagram(String input1, String input2) {
		int size1 = input1.length();// 3
		int size2 = input2.length();// 3

		String input3 = input1.toLowerCase();// care
		String input4 = input2.toLowerCase();// race

		char[] c1 = input3.toCharArray();// [c,a,r,e]
		char[] c2 = input4.toCharArray();// [r,a,c,e]

		Arrays.sort(c1);// [a,c,e,r]
		Arrays.sort(c2);// [a,c,e,r]

		String sortedStg1 = new String(c1);
		String sortedStg2 = new String(c2);

		if (size1 == size2) {
			if (Arrays.equals(c1, c2)) {
				System.out.println("It is A Anagram : " + sortedStg1 + " , " + sortedStg2);
			} else {
				System.out.println("Not A Anagram : " + sortedStg1 + " , " + sortedStg2);
			}
		} else {
			System.out.println("Not A Anagram : " + sortedStg1 + " , " + sortedStg2);
		}
		System.out.println("======================================");
	}

	public static void FindPalindrome(String input) {

		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		if (reversed.equalsIgnoreCase(input)) {
			System.out.println("It is Palindrome : " + input + " , " + reversed);
		} else {
			System.out.println("It is Not Palindrome : " + input + " , " + reversed);
		}
		System.out.println("======================================");
	}

	public static void CountOccurence(String input) {

		Map<Character, Integer> count = new HashMap<Character, Integer>();

		for (char ch : input.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0) + 1);
		}
		System.out.print("Occurence is : ");
		System.out.println(count);
		System.out.println("======================================");
	}

	public static void CoundAndPrintNumCharSpace(String input) {

		int alphabeticcount = 0;
		int digitCount = 0;
		int spaceCount = 0;
		int specialCount = 0;

		char[] words = input.toCharArray();
		for (char ch : words) {
			if (Character.isAlphabetic(ch)) {
				alphabeticcount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else if (Character.isWhitespace(ch)) {
				spaceCount++;
			} else {
				specialCount++;
			}
		}

		System.out.println("Total Aplhabet is : " + alphabeticcount);
		System.out.println("Total Numeric is : " + digitCount);
		System.out.println("Total Whitespace is : " + spaceCount);
		System.out.println("Total Special Caracter is : " + specialCount);
		System.out.println("======================================");
	}

	public static void FindMinMidMax() {
		int[] input = { 44, 22, 44, 66, 77, 11 };

		Arrays.sort(input);

		int min = input[0];
		int mid = input[input.length / 2 - 1];
		int max = input[input.length - 1];

		System.out.println("Minimum value is : " + min);
		System.out.println("Mid value is : " + mid);
		System.out.println("Maximum value is : " + max);
		System.out.println("======================================");
	}

	public static void DivisibleBy10(int input) {

		for (int i = 1; i <= input; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("======================================");
	}

	public static void FindNearestValue(int nearestValue) {

		int[] givenvalue = { 1, 3, 4, 5, 6, 7, 8, 9 };
		int firstvalue = givenvalue[0];
		for (int value : givenvalue) {
			if (Math.abs(value - nearestValue) < Math.abs(firstvalue - nearestValue)) {
				firstvalue = value;
			}
		}
		System.out.println("Nearest value of 2 is : " + firstvalue);
		System.out.println("======================================");
	}

	public static void RemoveDuplicates() {

		int[] input = { 1, 3, 3, 4, 5, 6, 6, 7, 8, 9 };
		// int[] removedInput = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int value : input) {
			set.add(value);
		}
		System.out.println(set);
		System.out.println("======================================");
	}

	public static void SwappingWithOut() {

		int a = 10;
		int b = 12;

//		a = a + b;// 10+12=22 a=22
//		b = a - b;// 22-12=10 b=10
//		a = a - b;// 22-10=12 a=12

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("SwappingWithOut : a=" + a + ", b=" + b);
		System.out.println("======================================");

	}

	public static void SwappingWithOut1() {
		int a = 10;
		int b = 12;
		int c = 14;

		a = a + b + c;// 10+12+14=36; a=36
		b = a - (b + c);// 36-(12+14); 36-26; b=10
		c = a - (b + c);// 36-(10+14); 36-24; c=12
		a = a - (b + c);// 36-(10+12); 36-22; a=14

//		a = a ^ b ^ c;
//		b = a ^ b ^ c;
//		c = a ^ b ^ c;
//		a = a ^ b ^ c;

		System.out.println("SwappingWithOut1 : a=" + a + ", b=" + b + ", c=" + c);
		System.out.println("======================================");
	}

	public static void SwappingWith() {
		int a = 10;
		int b = 7;
		int c;

		c = a;// c=10
		a = b;// a=7
		b = c;// b=10

		System.out.println("SwappingWith : a=" + a + ", b=" + b);
		System.out.println("======================================");
	}

	public static void SwappingWith1() {
		int a = 10;
		int b = 7;
		int c = 4;
		int d;

		d = a;// d=10
		a = b;// a=7
		b = c;// b=4
		c = d;// c=10

		System.out.println("SwappingWith1 : a=" + a + ", b=" + b + ", c=" + c);
		System.out.println("======================================");
	}

	public static void PrintStar(int input) {

		for (int i = input; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================================");
	}

	public static void FibonacciMultiplicationSerie(int input) {

		int first = 1, second = 2;

		System.out.println("Fibonacci Multiplication Series:");
		for (int i = 1; i <= input; i++) {
			System.out.print(first + " ");
			int next = first * second;
			first = second;
			second = next;
		}
		System.out.println();
		System.out.println("======================================");
	}

	public static void FibonacciAdditionSerie(int input) {
		int first = 1, second = 2;

		System.out.println("Fibonacci Addition Series:");
		for (int i = 1; i <= input; i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
		System.out.println();
		System.out.println("======================================");
	}

	public static void FindPrimeNumber() {
		int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9 };
		int firstvalue = 2;
		for (int number : numbers) {
			for (int i = 0; i <= numbers.length; i++) {
				if (number % firstvalue == 0) {
					System.out.println(number + " : it is Not a Prime number");
					break;
				} else {
					System.out.println(number + " : Its a Primenumber");
					break;
				}
			}
		}
		System.out.println("======================================");
	}

	public static void main(String[] args) {
		ReverseString("Aravindhan");
		ReverseStringWOChange("Aravindhan Ravi");
		RemoveSpicalChar("@ravind£an33");
		FindAnagram("care", "Race");
		FindPalindrome("Madam");
		CountOccurence("Aravindhan Ravi");
		CoundAndPrintNumCharSpace("32414dvasds  asd£$%^");
		FindMinMidMax();
		DivisibleBy10(33);
		FindNearestValue(4);
		RemoveDuplicates();
		SwappingWithOut();
		SwappingWithOut1();
		SwappingWith();
		SwappingWith1();
		PrintStar(10);
		FibonacciMultiplicationSerie(10);
		FibonacciAdditionSerie(10);
		FindPrimeNumber();
	}

}
