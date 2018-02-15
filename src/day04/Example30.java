package day04;

interface ParentLaptop {
	void showFeature();
	void showBrand();
} // end of ParentLaptop

interface Laptop extends ParentLaptop {

} // end of Laptop

interface Brand extends Laptop {

} // end of Brand

class MyLaptop1 implements Brand {

	@Override
	public void showFeature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showBrand() {
		// TODO Auto-generated method stub
		
	}

} // end of MyLaptop MyLaptop1

public class Example30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} // end of main

} // end of Example30
