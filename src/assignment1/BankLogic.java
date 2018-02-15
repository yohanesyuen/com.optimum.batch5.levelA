package assignment1;

import java.util.Scanner;

public class BankLogic {
	
	private int correct_id = 666;
	private String correct_password = "123456789";

	Scanner sc= new Scanner(System.in);	

	boolean loginAuthentication() {
		int user_id = -1;
		String user_password = "";
		do {
			System.out.println("Please enter your id:");
			user_id = Integer.parseInt(getUserInput());
			if (user_id != correct_id) {
				System.out.println("User id not found. Please try again!");
			}
		} while (user_id != correct_id);		
		
		do {
			System.out.println("Please enter your password:");		
			user_password = getUserInput();
			if (!user_password.equals(correct_password)) {
				System.out.println("Incorrect password. Please try again!");
			}
		} while (!user_password.equals(correct_password));
		
		if ( user_id == correct_id && user_password.equals(correct_password)) {
			return true;
		}
		
		return false;
	}
	void checkOption(int option, Bank account) {
		switch(option) {
			case 1:
				account.checkBalance();
				break;
			case 2:
				showWithdrawalScreen(account);
				break;
			case 3:
				showDepositScreen(account);
				break;
			default:
				System.out.println("Invalid Option!");
		}
	}
	
	void showWelcome() {
		System.out.println("Welcome to OCEAN BANK LTD");
	}
	
	void showMenu() {
		System.out.println("How may we help you today?");
		System.out.println("1. Check balance");
		System.out.println("2. Withdraw funds");
		System.out.println("3. Deposit funds");
	}
	
	void showWithdrawalScreen(Bank account) {
		System.out.println("Enter Amount: ");
		double amount = Double.parseDouble(getUserInput());
		account.withdraw(amount);
	}
	
	void showDepositScreen(Bank account) {
		System.out.println("Enter Amount: ");
		double amount = Double.parseDouble(getUserInput());
		account.deposit(amount);
	}
	
	
	String getUserInput() {
		String input = sc.next();
		return input;
	}
	
	String getUserInput(String prompt) {
		System.out.println(prompt);
		return getUserInput();
	}
}
