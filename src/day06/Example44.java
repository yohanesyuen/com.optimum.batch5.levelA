package day06;

class Computer {
	private final String CPU="Intel i7";
	class Display {
		String CPU;
		void show() {
			System.out.println("I am using a " + CPU + " processor!");
			CPU = "Intel Celeron";
		}
		
	}
	Display disp = new Display();
	Computer() {
		disp.show();
	}
}

public class Example44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Computer();

	}

}
