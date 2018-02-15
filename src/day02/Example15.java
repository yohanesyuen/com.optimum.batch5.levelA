package day02;

import java.util.Scanner;

class MyClass {
	void accessData(String name, int age) {
		System.out.println(name + " " + age);
		
	}
}

public class Example15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		
		String name = sc.next();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		new MyClass().accessData(name, age);
		sc.close();
	}

}
