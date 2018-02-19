package day06;

class MyClass1 {
	MyClass1() {
		System.out.println("MyClass1: default constructor");
		showMyClass1();
	}
	void showMyClass1() {
		System.out.println("showMyClass1 was called");
	}
}

class MyClass2 {
	{
		new MyClass1();
	}

}

class MyClass3 {

		static void check(int pwd) {
			System.out.println("Grr... Gimme yo password!");
			if (pwd == 111) {
				new MyClass2();
			} else {
				System.out.println("error..");
			}
		}
		
		{
			check(111);
		}
		
		static {
			System.out.println("MyClass3 Static: Meow!");
		}
}

public class Example41 {


	public static void main(String[] args) {
		new MyClass3();
	}
}
