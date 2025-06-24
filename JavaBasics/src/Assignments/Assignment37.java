package Assignments;

//WAP on Final Variable
public class Assignment37 {

	static final int globalVar = 33;
	final int nonStaticVar = 44;

	public void displayGlobalVariables() {
		System.out.println(globalVar);
		System.out.println(nonStaticVar);
	}

	public static void main(String[] args) {

		System.out.println(globalVar);

		Assignment37 as = new Assignment37();
		System.out.println(as.nonStaticVar);

		as.displayGlobalVariables();
	}

}
