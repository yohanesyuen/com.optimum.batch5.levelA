package day03;

class Super {
	void show() {
		System.out.println("Super: show()");
	}
}

class Sub extends Super {
	void show() {
		System.out.println("Sub : show()");
	}
	void access() {
		show();
	}
}

public class Example26 {

	public static void main(String[] args) {
		new Sub().access();
	}

}
