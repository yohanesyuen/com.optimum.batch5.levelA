package day03;

class GrandFather {
	void accessGrandFather() {
		System.out.println("Honest");
	}
}

class Father {
	void access() {
		System.out.println("Honest");
	}
}

class Child extends Father {
	void accessChile() {
		System.out.println("Intelligent");
	}
}

class Access extends Child {
	void display() {
		
	}
}

public class Example21 {

	public static void main(String[] args) {
	
	}

}
