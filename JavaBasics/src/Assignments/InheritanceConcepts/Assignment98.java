package Assignments.InheritanceConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//WAP to store account number, account holder name inside Map 
//by passing the values at runtime for both account number, account holder
public class Assignment98 {

	    public static void main(String[] args) {
	        // Creating a Map to store account details
	        Map<Integer, String> accountMap = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);

	        // Taking user input for account details
	        System.out.print("Enter the number of accounts: ");
	        int numAccounts = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        for (int i = 0; i < numAccounts; i++) {
	            System.out.print("Enter account number: ");
	            int accountNumber = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            System.out.print("Enter account holder name: ");
	            String accountHolder = scanner.nextLine();

	            // Storing values in the Map
	            accountMap.put(accountNumber, accountHolder);
	        }

	        // Displaying stored account details
	        System.out.println("\nStored Account Details:");
	        for (Map.Entry<Integer, String> entry : accountMap.entrySet()) {
	            System.out.println("Account Number: " + entry.getKey() + ", Account Holder: " + entry.getValue());
	        }

	        scanner.close();
	    }
	}
