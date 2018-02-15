package day05;

public class Product {

	private String productName;
	private int productQuantity;
	private double productPrice;
	public Product(String productName, int productQuantity, double productPrice) {
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return String.format("%s\t\t%d\t\t%f", productName, productQuantity, productPrice);
	}
	
	public double getQuantity() {
		return this.productQuantity;
	}
	
	public double getPrice() {
		return this.productPrice;
	}
}
