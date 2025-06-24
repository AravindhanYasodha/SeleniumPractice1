package MyPractice.AbstractionClass;

interface C extends B {

	 static void Cars() {
		A.Cars();
		B.Cars();
		System.out.println("Cars3");
	}

}
