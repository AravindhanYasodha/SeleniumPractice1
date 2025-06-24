package ExceptionHandlePractice;

public class MainMethodArugments {

	public static void method1(int [] args) {
		int a = args[0];
		int b = args[1];
		System.out.println(Integer.toString(a));
		System.out.println(Integer.toString(b));
	}
	
	
	public static void main(String[] args) {
		
		/*String username = args[0];
		String password = args[1];
		System.out.println(username);
		System.out.println(password); */
		method1(null);
		
		

	}



}
