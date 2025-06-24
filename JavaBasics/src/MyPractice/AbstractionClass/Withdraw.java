package MyPractice.AbstractionClass;

 class Withdraw extends BankTransaction{

	
	void processTransaction(double amount) {
		System.out.println("Withdraw Amount :"+amount);
		
	}

}
