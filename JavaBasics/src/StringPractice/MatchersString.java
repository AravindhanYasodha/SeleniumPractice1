package StringPractice;

import java.util.Random;

public class MatchersString {
	
	
	public static void RandomGmail(String gmali) {
		
		
		String stgChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int length = 10; // Length of the random string
        Random random = new Random();

        // Generate random string
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(stgChar.length());
            randomString.append(stgChar.charAt(index));
        }
		String stg5 = randomString+gmali;
		boolean b5 = stg5.matches("(.*)@gmail.com");
		System.out.println(b5);
		if(b5==true) {
			System.out.println(stg5);
		}else {
			System.out.println("Not a valid Gmail Account");
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		String stg="Men are not Women";
		
		boolean b1 = stg.matches("(.*)men(.*)");
		System.out.println(b1);
		

		String stg1 ="All man are superman";
		boolean b2 = stg1.matches("All(.*)man");
		System.out.println(b2);
		
		boolean b3 = stg1.matches("(.*)man(.*)man");
		System.out.println(b3);

		RandomGmail("@gmail.com");
		
		
        
		
	}
	
	

}
