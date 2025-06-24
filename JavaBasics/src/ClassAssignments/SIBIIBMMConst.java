package ClassAssignments;

public class SIBIIBMMConst {

	void Maruthi() {
		System.out.println("Method Maruthi");
	}

	static void Maruthi1() {
		System.out.println("Static Method Maruthi1");
	}
	
	static {
		System.out.println("SIB1 Ford");
	}
	
	static {
		System.out.println("SIB2 Ford");
	}

	{
		System.out.println("IIB1 BMW");
	}
	
	{
		System.out.println("IIB2 BMW");
	}

	SIBIIBMMConst() {
		System.out.println("Default Constructor Audi");
	}
	
	SIBIIBMMConst(String car) {
		System.out.println("Parametarized Constructor "+car);
	}
	
	public static void main(String[] args) {
		
		Maruthi1();
		System.out.println("Main Method Car");
		SIBIIBMMConst si = new SIBIIBMMConst();
		si.Maruthi();
		new SIBIIBMMConst("Benz");
		
		
		
		
		
	}

}
