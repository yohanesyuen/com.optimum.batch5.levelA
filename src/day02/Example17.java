package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// example of BufferedReader
class UserInput {
	void acceptData() throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter Character: ");
//		char c = (char)rd.read();
//		System.out.println(c);
		System.out.println("Enter Age: ");
		int age = rd.read();
		System.out.println((char)age);
	}
}

public class Example17 {

	public static void main(String[] args) throws IOException {
		UserInput ref = new UserInput();
		ref.acceptData();
	}

}
