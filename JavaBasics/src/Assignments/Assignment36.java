package Assignments;

//WAP to update static and non static global variable
public class Assignment36 {

	static int globalVar = 33;
	int nonStaticVar = 44;

	public void displayGlobalVariables(int nonstatic) {
		globalVar = 11;
		nonStaticVar = nonstatic;
		System.out.println(globalVar);
		System.out.println(nonStaticVar);
	}

	public static void main(String[] args) {

		System.out.println(globalVar);

		Assignment36 as = new Assignment36();
		System.out.println(as.nonStaticVar);

		as.displayGlobalVariables(22);
	}

}
