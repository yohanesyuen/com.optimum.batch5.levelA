package day05;

class Employee {
	String employeeName = "James";
	
	@Override
	public String toString() {
		return employeeName;
	}
}

public class Example33 {

	public static void main(String[] args) {
		Employee refEmployee = new Employee();
		System.out.println(refEmployee);
	}

}
