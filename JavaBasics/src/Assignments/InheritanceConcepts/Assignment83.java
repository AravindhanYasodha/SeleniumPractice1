package Assignments.InheritanceConcepts;
//WAP to count the number of alpahebets, numeric letters,spaces and special characters used in the given String                
import java.util.Scanner;

public class Assignment83 {

	public static void CountOccuranceOfDiffValue() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int numericCount = 0;
		int spaceCount = 0;
		int specialCount = 0;
		int alphabetCount = 0;

		char[] value = input.toCharArray();
		for (char ch : value) {
			if (Character.isAlphabetic(ch)) {
				alphabetCount++;
			} else if (Character.isWhitespace(ch)) {
				spaceCount++;
			} else if (Character.isDigit(ch)) {
				numericCount++;
			} else {
				specialCount++;
			}
		}
		System.out.println("Total Alphabet is : " + alphabetCount);
		System.out.println("Total NumericCount is : " + numericCount);
		System.out.println("Total SpecialCount is : " + specialCount);
		System.out.println("Total SpaceCount is : " + spaceCount);
	}

	public static void main(String[] args) {
		CountOccuranceOfDiffValue();

	}

}
