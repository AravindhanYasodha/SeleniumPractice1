package StringPractice;

import java.util.Arrays;
import java.util.HashMap;

public class OccuranceChar {

	static void reverseString() {
		String name = "Aravindhan Ravi";
		String reversed = "";

		String[] cha = name.split(" ");
		for (String word : cha) {

			StringBuilder sb = new StringBuilder(word);
			reversed += sb.reverse();

		}
		System.out.println(reversed);
	}

	static void reverseStg() {

		String stg = "ab AB cd CD ef EF";
		String reversed = "";

		String[] splited = stg.split(" ");

		for (String word : splited) {

			for (int i = word.length() - 1; i >= 0; i--) {

				reversed += word.charAt(i);

			}
			reversed += " ";
		}

		System.out.println(reversed);

	}

	static void anagram() {

		String stg1 = "Care";
		String stg2 = "Race";

		String word1 = stg1.toLowerCase();
		String word2 = stg2.toLowerCase();

		char[] text1 = word1.toCharArray();
		char[] text2 = word2.toCharArray();

		Arrays.sort(text1);
		Arrays.sort(text2);

		if (Arrays.equals(text1, text2)) {
			System.out.println("It is a Anangram");
			System.out.println(text1);
			System.out.println(text2);
		} else {
			System.out.println("It is Not a Anagram");
			System.out.println(text1);
			System.out.println(text2);
		}

	}

	static void anagram2() {

		String stg1 = "Care";
		String stg2 = "Race";

		String word1 = stg1.toLowerCase();
		String word2 = stg2.toLowerCase();

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		if (word1.length() != word2.length()) {

			System.out.println("It is Not a Anagram");
			System.out.println(word1);
			System.out.println(word2);

		}
		for (char c : word1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}
		for (char cc : word2.toCharArray()) {
			map2.put(cc, map2.getOrDefault(cc, 0) + 1);
		}
		if (map1.equals(map2)) {
			System.out.println("It is a Anagram");
			System.out.println(word1);
			System.out.println(word2);
		} else {
			System.out.println("It is Not a Anagram");
			System.out.println(word1);
			System.out.println(word2);
		}

	}

	static void occuranceChara() {

		String stg = "aa BBB cc DD ee FFF";

		String replaced = stg.replaceAll("[^a-zA-Z]", "");
		// System.out.println(replaced);
		// String lowerStg = replaced.toLowerCase();
		char[] target = replaced.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : target) {
			if (Character.isLowerCase(ch)) {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			} else {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}

		}
		for (char key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}

	}

	public static void main(String[] args) {

		reverseString();
		occuranceChara();
		reverseStg();
		anagram();
		anagram2();
	}

}
