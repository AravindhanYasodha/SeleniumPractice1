package Assignments.InheritanceConcepts;
//Find out the average of all the numbers present in your array
public class Assignment75 {

	public static void AverageNumber() {

		int[] numbers = { 10, 44, 55, 77, 33 };
		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}

		double average = (double)sum / numbers.length;
		System.out.println("Average value is : " + average);
	}

	public static void main(String[] args) {
		AverageNumber();
	}
}
