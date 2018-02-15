package assignment1;

public class BankApplication {

	public static void main(String[] args) {
		BankLogic controller = new BankLogic();
		Bank			account;
		boolean authenticated = false;
		authenticated = controller.loginAuthentication();
		
		if (authenticated) {
			account = new Bank();
			controller.showWelcome();
			
			loop(controller, account); // Program Loop
		}
		System.out.println("Thanks for banking with OCEAN BANK!!!");
	}
	
	static void loop(BankLogic controller, Bank account) {
		boolean running = true;
		String currentInput;
		do {
			controller.showMenu(); // display Menu
			
			currentInput = controller.getUserInput(); // variable to hold user input before parsing 
			int option = Integer.parseInt(currentInput); // get user's selected option
			
			controller.checkOption(option, account);
			
			running = getYesNo("Would you like to continue?", controller); // Allow user to quit upon completing transactions
		} while (running);
	}
	
	static boolean getYesNo(String prompt, BankLogic controller) {
		boolean validInput = true;
		boolean answer = true;
		do {
			String input = controller.getUserInput(prompt + " (yes/no)"); // prompts user 
			input = input.toLowerCase(); // Convert to lower case to facilitate parsing
			switch(input) {
				case "y":
				case "yes":
					validInput = true;
					answer = true;
					break;
				case "n":
				case "no":
					validInput = true;
					answer = false;
					break;
				default:
					validInput = false;
					break;
			}
		} while (!validInput);
		return answer;
	}
}
