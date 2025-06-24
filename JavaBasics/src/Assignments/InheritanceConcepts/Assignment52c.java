package Assignments.InheritanceConcepts;

public class Assignment52c implements Assignment52b {
	@Override
	public void hospital() {
		System.out.println("Reached Hospital");
	}
	@Override
	public void wardroom() {
		System.out.println("Entered Wardroom");
	}

	public void bed() {
		System.out.println("Admitted in Bed");
	}

	public static void main(String[] args) {

		Assignment52c asc = new Assignment52c();
		asc.hospital();
		asc.wardroom();
		asc.bed();
	}

}
