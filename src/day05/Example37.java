package day05;

import day05.OuterClass2.InnerClass3;

class OuterClass2 {
	class InnerClass2 {
		void show2() {
			System.out.println("show from: " + this.getClass().getName());
		}
	} // end of InnerClass2

	static class InnerClass3 {
		static void show3() {
			System.out.println("show from: InnerClass3");
		}
	} // end of InnerClass3
} // end of OuterClass2

public class Example37 {

	public static void main(String[] args) {
		InnerClass3.show3();
	} // end of main

} // end of Example37
