package day01;


class Employee {
	void show1() { // non-static / instance method
		Debugger.debug();
	} // end of show1
	
	static void show2() {
		Debugger.debug();
	} // end of show2
} // end of Employee

public class Example03 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.show1();
		Employee.show2();
	} // end of main
} // end of Example03
