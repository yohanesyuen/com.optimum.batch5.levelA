package day03;

class Country {
	Country(int i) { // default constructor
		System.out.println("Country: " + i);
	}
}

class Singapore extends Country {
	public Singapore(int i, String s) {
		super(i);
		int temp = 100+i;
		System.out.println(temp + " " + s);
	}
}

public class Example25 {

	public static void main(String[] args) {
		new Singapore(50, "SGD");
	}

}
