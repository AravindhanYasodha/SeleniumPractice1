package MyPractice.AbstractionClass;

public class D implements A,B,C{

	   void Cars() {
		A.Cars();
		B.Cars();
		C.Cars();
		System.out.println("Cars4");
	}
	static void Car() {
		A.Cars();
		B.Cars();
		C.Cars();
		System.out.println("Cars4");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		d.Cars();
		System.out.println("Staic Method");
		Car();
	}

}
