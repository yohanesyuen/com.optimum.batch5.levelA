package sicp;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		final int MAJOR_VERSION = 0;
		final int MINOR_VERSION = 1;
		final String versionString = "v" + MAJOR_VERSION + "." + MINOR_VERSION;
		String welcomeMessage = "Welcome to SICP Lisp " + versionString;
		System.out.println(welcomeMessage);
		
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		while (running) {
			System.out.print("> ");
			Expression e;
			String str = sc.nextLine();
		}
	}

}
