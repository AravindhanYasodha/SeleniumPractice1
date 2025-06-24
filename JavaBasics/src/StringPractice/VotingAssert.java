package StringPractice;

public class VotingAssert {
	
	
	static int add() {
		
		int a = 10;
		int b = 30;
		int c = a+b;
		return c;
	}

	static void continuemethod() {
			
		
		for (int a = 10; a >= 0; a--) {

			if (a == 6) {
				System.out.println("6 is skiped");
				continue;

			}
			System.out.println(a);
		}
	}
	

	public static void main(String[] args) {

//		int age = 12;
//
//		assert age >= 18 : "Age is below 18."; // Provide a message for the error
//		{
//			System.out.println("Eligible for Vote");
//		}
		
		
		continuemethod();

	}

}
