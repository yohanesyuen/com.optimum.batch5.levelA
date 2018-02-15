package day02;

import java.util.Scanner;

public class Example19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice;

		do {
			System.out.println("Enter name: ");
			String name = sc.next();

			System.out.println(name);
			System.out.println("Wiss to Continue? [y/N]");
			choice = sc.next();

		} while (!choice.equals("no"));
		System.out.println("Thank You!");
		sc.close();
	}

}
