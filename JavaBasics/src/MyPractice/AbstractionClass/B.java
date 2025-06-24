package MyPractice.AbstractionClass;

 interface B extends A{
	
	   static void Cars() {
		A.Cars();
		System.out.println("Cars2");
	}

}
