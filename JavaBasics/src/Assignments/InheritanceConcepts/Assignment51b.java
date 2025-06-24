package Assignments.InheritanceConcepts;

public class Assignment51b implements Assignment51a {

	@Override
	public void car() {
		System.out.println("Car Driving");

	}

	@Override
	public void bike() {
		System.out.println("Bike Riding");

	}

	public void flight() {
		System.out.println("Flight flying");
	}

	public static void main(String[] args) {

		Assignment51b asb = new Assignment51b();
		asb.flight();
		asb.car();
		asb.bike();

	}

}
