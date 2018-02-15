package assignment1;

public class Bank {
	private int balance = 0;
	void withdraw(Double amount) {
		if (!validAmount(amount)) {
			System.out.println("Invalid input!");
			return;
		}
		if (amount > balance) { // Check that user has sufficient balance
			System.out.println("Insufficient balance to fulfil transaction!");
			System.out.println("Your current balance: " + balance);
		} else {
			balance -= amount;
			System.out.println("Please take your cash of: " + amount);
			System.out.println("Available Balance: " + balance);
		}
	}
	void deposit(Double amount) {
		if (!validAmount(amount)) {
			System.out.println("Invalid input!");
			return;
		}
		balance += amount;
		System.out.println("Amount " + amount + " deposited successfully.");
	}
	void checkBalance() {
		System.out.println("Available Balance: " + balance);
	}
	boolean validAmount(Double amount) {
		return amount > 0;
	}
}
