package day01;

public class Example08 {

	public static void main(String[] args) {
		main(20);
	}

	public static void main(int i) {
		main("java");
		System.out.println(i);
	}
	
	public static void main(String s) {
		main(20.50);
		System.out.println(s);
	}
	
	public static double main(double d) {
		return d;
	}
}
