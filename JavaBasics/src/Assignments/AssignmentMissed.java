package Assignments;

//Write a program on +,-,*,/ and % operators
public class AssignmentMissed {

	static void add() {

		int a = 10;
		int b = 33;
		System.out.println("Addtion of two Variable is : " + (a + b));
	}

	static void sub() {

		int a = 10;
		int b = 33;
		System.out.println("Subtract of two Variable is : " + (a - b));
		System.out.println("Subtract of two Variable is : " + (b - a));
	}

	static void multi() {

		int a = 10;
		int b = 33;
		System.out.println("Multiple of two Variable is : " + (a * b));
	}

	static void divi() {

		int a = 10;
		int b = 33;
		System.out.println("Divisible of two Variable is : " + (a / b));
		System.out.println("Divisible of two Variable is : " + (b / a));
	}

	static void modulus() {

		int a = 10;
		int b = 33;
		System.out.println("Modulus of two Variable is : " + (a % b));
		System.out.println("Modulus of two Variable is : " + (b % a));
	}

	public static void main(String[] args) {

		add();
		sub();
		multi();
		divi();
		modulus();
	}

}
