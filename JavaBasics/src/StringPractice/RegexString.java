package StringPractice;

import java.util.regex.*;

public class RegexString {

	// User input string
	private static String input = "Name: John Doe, Email: john.doe@example.com, Phone: +91-9876543210, Date: 07/04/2025, Website: https://www.example.com";

	private static void extractMatch(String input, String regex, String label) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		if (matcher.find()) {
			System.out.println(label + ": " + matcher.group());
		} else {
			System.out.println(label + ": Not Found");
		}
	}

	public static void main(String[] args) {

		// Regex patterns
		String nameRegex = "Name:\\s([A-Za-z\\s]+)";
		String emailRegex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
		String phoneRegex = "\\+\\d{2}-\\d{10}";
		String dateRegex = "\\d{2}/\\d{2}/\\d{4}";
		String urlRegex = "https?://[A-Za-z0-9./%+-]+";

		// Match and extract using Matcher
		extractMatch(input, nameRegex, "Name");
		extractMatch(input, emailRegex, "Email");
		extractMatch(input, phoneRegex, "Phone");
		extractMatch(input, dateRegex, "Date");
		extractMatch(input, urlRegex, "Website");
	}

}
