package MyPractice.AbstractionClass;

public class ATM {

	public static void main(String[] args) {
		
		BankTransaction bankTran = new Withdraw();
		bankTran.processTransaction(500);
		bankTran.printRecepit();
		
		BankTransaction depoTran = new  Deposit();
		depoTran.processTransaction(1000);

	}

}
