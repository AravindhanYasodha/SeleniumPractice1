package Assignments.InheritanceConcepts;
//WAP on throws keyword concept
public class Assignment63 {

	public static void main(String[] args) throws ArithmeticException {

		int num = -5;

		if (num < 0) {
			throw new ArithmeticException("Negative numbers are not allowed.");
		} else {
			System.out.println("Valid number: " + num);
		}
	}
}
