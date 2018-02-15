package day05;

// method local inner class
// not private, not static

class MyOuterClass {
	void showMyOuterClass() {
		class MyInnerClass {
			void showMyInnerClass() {
				System.out.println("Welcome");
			} // end of showMyInnerClass
		} // end of MyInnerClass
		MyInnerClass refMyInnerClass = new MyInnerClass();
		refMyInnerClass.showMyInnerClass();
	} // end of showMyOuterClass
} // end of MyOuterClass

public class Example38 {
	public static void main(String[] args) {
		MyOuterClass refMyOuterClass = new MyOuterClass();
		refMyOuterClass.showMyOuterClass();
	} // end of main
} // end of Example38
