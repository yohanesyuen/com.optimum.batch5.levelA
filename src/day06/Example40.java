package day06;

class StaticDemo {
	{
		System.out.println("Hellow from non-static block..");
	}
	
	static {
		System.out.println("Hello from static block");
	}
	
	StaticDemo() {
		System.out.println("Hello from default constructor");
	}
}

public class Example40 {

	public static void main(String[] args) {
		
		new StaticDemo();
		
	}

}
