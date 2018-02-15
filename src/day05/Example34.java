package day05;

import java.util.Scanner;

class User {
	Scanner sc;
	public User(Scanner sc) {
		this.sc = sc;
	}
	
	public String ask(String prompt) {
		System.out.println(prompt);
		return sc.next();
	}
}

public class Example34 {	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User(sc);
		System.out.println("Enter number of products to add:");
		Product refProduct[] = new Product[sc.nextInt()];
		
		for (int i = 0; i < refProduct.length; i++) {
			String name = user.ask("Enter Product Name : ");
			int quantity = Integer.parseInt(user.ask("Enter Product Quantity : "));
			double price = Double.parseDouble(user.ask("Enter Product Price :"));
			refProduct[i] = new Product(name, quantity, price);
		}
		
		double totalPrice = 0;
		
		for (Product product : refProduct) {
			System.out.println(product);
			totalPrice += product.getQuantity() * product.getPrice();
		}
		
		System.out.println("Total Price: " + totalPrice);
		
		sc.close();
	}

}
