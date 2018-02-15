package day02;

import java.util.ArrayList;
import java.util.List;

// constructor

class Employee {
	private String employeeName;
	
	Employee() {
		employeeName = "James";		
	}

	public Employee(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + "]";
	}
}

public class Example10 {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());
		employees.add(new Employee("Esmond"));
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	} // end of main

} // end of Example10
