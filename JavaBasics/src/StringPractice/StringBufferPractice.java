package StringPractice;

public class StringBufferPractice {

	static void StringBufferMethods() {
		
		String stg = "Aravindhan Ravi";
		
		StringBuffer bf = new StringBuffer(stg);
		System.out.println(bf.append(stg+" "+stg));
		System.out.println(bf.insert(2, 'z'));
		System.out.println(bf.capacity());
		//bf.ensureCapacity(31);
		
		
		
	}
	

	public static void main(String[] args) {
		
		StringBufferMethods();

	}

}
