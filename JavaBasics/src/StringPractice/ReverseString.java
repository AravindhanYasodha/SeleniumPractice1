package StringPractice;

public class ReverseString {
	
	static void reverstring1() {
		String stg = "Aravindhan Ravi";
		String rever = "";

		for (int i = stg.length() - 1; i >= 0; i--) {

			char c = stg.charAt(i);
			rever += c;
		}
		System.out.println(rever);
	}

	static void reversestring2() {

		String stg = "Aravindhan Ravi";
		String reversed = " ";

		String[] words = stg.split(" ");

		for (String word : words) {

			for (int i = word.length() - 1; i >= 0; i--) {

				char c = word.charAt(i);
				reversed += c;
			}
			reversed  += " ";
		}
		System.out.println(reversed.trim());
	}
	
	static void reversestring3() {
		
		String stg = "Aravindhan Ravi";
		String reversed = "";
		
		String [] words = stg.split(" ");
		
		for(String word : words) {
			StringBuffer sb = new StringBuffer(word);
			reversed += sb.reverse()+" ";
		}
		System.out.println(reversed);
	}

	public static void main(String[] args) {
		
		reverstring1();
		reversestring2();
		reversestring3();
		
		
	}

}
