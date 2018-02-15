package day05;
// Inner Classes
// 1. Non-static inner class cannot have static methods
class OuterClass1 {
	class InnerClass1 {
		void showInnerClass1 () {
			System.out.println("show from: " + this.getClass().getName());
		}
	}
	
	InnerClass1 refInnerClass1 = new InnerClass1();
	
	void showOuterClass1() {
		System.out.println("show from: " + this.getClass().getName());
		refInnerClass1.showInnerClass1();
	}
}

// 2. Static inner class
// 3. ??
// 4. Anonymous inner class

public class Example36 {

	public static void main(String[] args) {
		OuterClass1 refOuterClass1 = new OuterClass1();
		refOuterClass1.refInnerClass1.showInnerClass1();
		refOuterClass1.showOuterClass1();
	}

}
