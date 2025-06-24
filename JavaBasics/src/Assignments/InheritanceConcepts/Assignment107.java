package Assignments.InheritanceConcepts;

//WAP on Encapsulation concept
public class Assignment107 {
	// Private variables (data hiding)
	private String accountHolder;
	private double balance;

	// Constructor
	public Assignment107(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	// Getter method to access private data
	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	// Setter method to modify private data
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount!");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount!");
		}
	}

	public static void main(String[] args) {
		// Creating an object of BankAccount
		Assignment107 account = new Assignment107("Aravindhan", 5000);

		// Accessing data using getter methods
		System.out.println("Account Holder: " + account.getAccountHolder());
		System.out.println("Balance: " + account.getBalance());

		// Modifying data using setter methods
		account.deposit(2000);
		account.withdraw(1500);

		// Checking updated balance
		System.out.println("Updated Balance: " + account.getBalance());
	}
}
