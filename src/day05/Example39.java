package day05;

// We can override abstract methods from anonymous class or interface through
// anonymous inner class

abstract class Car {
	abstract void showFeature();
} // end of Car

interface Bank {
	void showBank();
} // end of Bank

class MyClass {
	Car cRef = new Car() {
		@Override
		void showFeature() {
			System.out.println("Car method Override");
		}
	};
	
	Bank bRef = new Bank() {
		@Override
		public void showBank() {
			System.out.println("Bank method Override");
		}
	};
}
public class Example39 {

	public static void main(String[] args) {
		MyClass refMyClass = new MyClass();
		refMyClass.cRef.showFeature();
		refMyClass.bRef.showBank();
	} // end of main

} // end of Example39
