package bank;

import java.util.Scanner;

// Factory Design Pattern

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice: ");
		Bank refBank = BusinessLogic.choice(sc.next());

		if (refBank != null) {
			System.out.println(refBank.showBank());
		} else {
			System.out.println("Bank not found!");
		}
		sc.close();
	}

}
