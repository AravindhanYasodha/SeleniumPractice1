package Assignments.InheritanceConcepts;
//WAP to find out the current date, past date and future date using String function
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Assignment85 {

	public static void main(String[] args) {
		// Define date format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		// Get current date
		LocalDateTime currentDate = LocalDateTime.now();
		System.out.println("Current Date: " + currentDate.format(formatter));

		// Get past date (subtracting 7 days)
		LocalDateTime pastDate = currentDate.minusDays(7);
		System.out.println("Past Date (7 days ago): " + pastDate.format(formatter));

		// Get future date (adding 7 days)
		LocalDateTime futureDate = currentDate.plusDays(7);
		System.out.println("Future Date (7 days later): " + futureDate.format(formatter));
	}
}
