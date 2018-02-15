package day03;

	
	

class MyDriver {
	private static MyDriver refMyDriver;
	MyDriver() {
		System.out.println("Driver object created..");
	}
	
	public static MyDriver getDriver() {
		if (refMyDriver == null)
			refMyDriver = new MyDriver();
		return refMyDriver;
	}
}

public class Example20 {

	public static void main(String[] args) {
		MyDriver.getDriver();
		MyDriver.getDriver();
		MyDriver.getDriver();
		MyDriver.getDriver();
		MyDriver.getDriver();
		MyDriver.getDriver();


	}

}
