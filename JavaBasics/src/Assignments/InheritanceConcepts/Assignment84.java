package Assignments.InheritanceConcepts;
//WAP on string functions using replace, replaceAll, substring, matches, repeat
public class Assignment84 {

	public static void main(String[] args) {
		String text = "Hello, Viewers Welcome to Java.";

		// Using replace() - Replaces specific characters
		String replacedText = text.replace("Viewers", "Subscribers");
		System.out.println("After replace(): " + replacedText);

		// Using replaceAll() - Replaces using regex
		String regexReplaced = text.replaceAll("\\s", "_"); // Replaces spaces with '_'
		System.out.println("After replaceAll(): " + regexReplaced);

		// Using substring() - Extracts part of the string
		String subText = text.substring(7, 14); // Extracts "Viewers"
		System.out.println("Substring result: " + subText);

		// Using matches() - Checks if string matches a pattern
		boolean isMatch = text.matches(".*Java.*"); // Checks if "Java" is present
		System.out.println("Matches result: " + isMatch);

		// Using repeat() - Repeats the string multiple times
		String repeatedText = "Hello ".repeat(3);
		System.out.println("Repeated text: " + repeatedText);
	}
}
