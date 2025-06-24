package ArrayPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayPravtice {

	public static void ArrayRuntimeinString() {

		Scanner sc = new Scanner(System.in);

		String[] name = new String[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Enter the Value of index : " + i);
			name[i] = sc.next();
		}
		System.out.println(Arrays.toString(name));
		sc.close();
	}

	public static void CopyOneArraytoAnother() {

		int arr1[] = new int[4];
		int arr2[] = new int[3];

		arr1[0] = 12;
		arr1[1] = 14;
		arr1[2] = 13;
		arr1[3] = 15;

		arr2 = Arrays.copyOf(arr1, arr1.length);

		System.out.println(Arrays.toString(arr2));

	}

//Class 7/4/25
	public static void AnagramFind() {

		int arr1[] = new int[4];
		int arr2[] = new int[4];

		arr1[0] = 12;
		arr1[1] = 14;
		arr1[2] = 13;
		arr1[3] = 15;

		arr2[0] = 12;
		arr2[1] = 13;
		arr2[2] = 14;
		arr2[3] = 15;

		boolean bo = Arrays.equals(arr1, arr2);
		System.out.println(bo);
		if (bo == true) {
			System.out.println("It is Anagram");
		} else {
			System.out.println("Not a Anagram");
		}

	}

	public static void AverageValue() {

		int[] values = { 22, 66, 44, 77 };
		int sum = 0;
		int count = 0;

		for (int i = 0; i < values.length; i++) {

			sum += values[i];
			count++;

		}
		System.out.println(sum);
		System.out.println(count);
		double average = sum / count;
		System.out.println(average);
	}

	public static void FindAverage() {

		int sum = 0;
		int num[] = new int[4];
		num[0] = 4;
		num[1] = 3;
		num[2] = 4;
		num[3] = 3;

		for (int i = 0; i < 4; i++) {

			sum = sum + num[i];

		}
		System.out.println(sum);
		double average = sum / num.length;
		System.out.println(average);
	}

	public static void AnagramFindString() {

		String stg1 = "care";

		String stg2 = "race";

		if (stg1.length() != stg2.length()) {
			System.out.println("They are not Anagram");
		} else {
			char c1[] = stg1.toCharArray();
			char c2[] = stg2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);

			boolean b = Arrays.equals(c1, c2);
			if (b == true) {
				System.out.println("Its a Anagram");

			} else {
				System.out.println("It not a Anagram");
			}

		}

	}

	static void AnagramFindString1() {
		
		String stg1 = "care";

		String stg2 = "race";
		
		String reversed = "";
		
		char [] c1 = stg1.toCharArray();
		char [] c2 = stg2.toCharArray();
		
		int size = c1.length;
		for(int i=size-1; i>=0; i--) {
			
			reversed += c1[i];
			
		}
		System.out.println(reversed);
		
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String c11 = new String(c1);
		String c22 = new String(c2);
		
		//String c11 = c1.toString();
		//String c22 = c2.toString();
		
		if(c11 == c22) {
			System.out.println("It is a Anagram : "+c11+" & "+c22);
		}
		else {
			System.out.println("It is Not a Anagram : "+c11+" & "+c22);
		}
		
	}
	static void findCharacterOccurrences() {
		
		String str = "My Name is Aravindhan Ravi";
		String stg = str.toLowerCase();
		
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through characters in the string
        for (char c : stg.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print character occurrences
        for (char c : charCountMap.keySet()) {
            System.out.println("Character '" + c + "' occurs " + charCountMap.get(c) + " times.");
        }
    }
	
	
	public static void FindNumericCount() {

		String input = "Aravind123@";
		char[] arr = input.toCharArray();

		int digitCount = 0;
		int alphaCount = 0;
		int specialCount = 0;

		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i])) {
				digitCount++;
			} else if (Character.isAlphabetic(arr[i])) {
				alphaCount++;
			} else {
				specialCount++;
			}
		}
		System.out.println("Count of Digit : "+digitCount);
		System.out.println("Count of Alphabet : "+alphaCount);
		System.out.println("Count of Special Character : "+specialCount);
	}

	public static void FindMaxMinValues1() {

		int[] values = { 33, 66, 11, 7, 9, 4 };
		int max = 0;
		int min = 0;

		Arrays.sort(values);
		min = values[0];
		max = values[values.length - 1];

		System.out.println(min);
		System.out.println(max);
	}

	public static void main(String[] args) {

		/*
		 * CopyOneArraytoAnother(); AnagramFind(); FindAverage(); AnagramFindString();
		 * 
		 * AverageValue();
		 */
		//FindNumericCount();
		//AnagramFindString1();
		findCharacterOccurrences();
		
		
	}

}
