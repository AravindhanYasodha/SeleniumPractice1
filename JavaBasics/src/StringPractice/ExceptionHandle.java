package StringPractice;

public class ExceptionHandle {

	public static void main(String[] args) 
	{
		
		int a = 10;
		
		try 
		{
			int b=a/0;
			System.out.println(b);
		}
		catch(ArithmeticException aa) 
		{
			System.out.println("Arithmetic Exception Handled");
		}
		
		
		

	}

}
