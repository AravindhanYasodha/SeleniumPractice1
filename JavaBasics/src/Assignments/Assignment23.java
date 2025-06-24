package Assignments;

//WAP to implement math class(add, sub, multi,min)
public class Assignment23 {

	public static void main(String[] args) {
		
		int a = 10;
		long b = 1245325;
		double c = 11.12d;
		float d = 12.13f;
		
		System.out.println(Math.addExact(a, b));
		System.out.println(Math.subtractExact(b,a));
		System.out.println(Math.multiplyExact(b, a));
		System.out.println(Math.min(c, d));

	}

}
