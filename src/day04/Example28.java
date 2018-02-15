package day04;

abstract class Oracle {
	abstract void showOracle();
}

abstract class Microsoft {  // can't extend Oracle
	abstract void showMicrosoft();
}

class MyClass  extends Microsoft{

	@Override
	void showMicrosoft() {
		// TODO Auto-generated method stub
		
	}
	
	Oracle oRef = new Oracle() {

		@Override
		void showOracle() {
			// TODO Auto-generated method stub
			System.out.println("showOracle Override");
		}
		
	};
	
}

public class Example28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass refMyClass = new MyClass();
		refMyClass.oRef.showOracle();
	}

}
