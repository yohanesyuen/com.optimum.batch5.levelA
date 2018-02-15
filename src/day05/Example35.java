package day05;

class MyData {
	void getData(Object objectRef) {
		System.out.println(objectRef);
	}
}

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}

public class Example35 {

	public static void main(String[] args) {
		MyData refMyData = new MyData();
		
		refMyData.getData(123456);
		refMyData.getData("abcdef");
		refMyData.getData(12.34);
		
		Person pRef = new Person();
		pRef.setName("James");
		
		refMyData.getData(pRef);
	}

}
