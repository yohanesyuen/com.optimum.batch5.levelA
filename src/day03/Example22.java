package day03;

class Parent { // base /super
	void show1() {
		System.out.println("Parent: show1()");
	}
	static void show2() {
		System.out.println("Parent: show2()");
	}
}

class Child1 extends Parent {
	void show1() {
		System.out.println(("Child1: show1()"));
	}
	static void show2() {
		System.out.println(("Child1: show1()"));
	}
	
}

public class Example22 {

	public static void main(String[] args) {
		Parent refParent = new Child1();
		refParent.show1();
		Child1.show2();
	}

}
