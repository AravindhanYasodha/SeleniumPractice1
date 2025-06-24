package MyPractice.AbstractionClass;

abstract class BankTransaction {
	
	abstract void processTransaction(double amount) ;
	
	void printRecepit() {
		System.out.println("Transaction Completed");
	}

}
