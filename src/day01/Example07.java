package day01;

// problem without encapsulation

class Mobile {
	private int price = 200;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
} // end of Mobile
public class Example07 {

	public static void main(String[] args) {
		Mobile refMobile = new Mobile();
		System.out.println(refMobile.getPrice());
	} // end of main

} // end of Example07
