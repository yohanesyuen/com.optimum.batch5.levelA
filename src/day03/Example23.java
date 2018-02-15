package day03;

// method overriding example

class Brand {
	void showBrand() { // final / private / protected / static no override
		System.out.println("show Brand..");
	}
}

class Apple extends Brand {
	@Override
	void showBrand() {
		System.out.println("show Brand");
	}
}

public class Example23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
