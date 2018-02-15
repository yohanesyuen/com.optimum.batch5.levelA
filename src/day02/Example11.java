package day02;

//import java.util.ArrayList;
//import java.util.List;

class Student {
	private int age;
	private String name;
	private int studentID;
	private String address;
	
	public Student() {
		Debugger.debug();
		this.age=-1;
		this.name="Anonymous";
		this.studentID = -1;
		this.address = "Earth";
	}
	
	public Student(int age) {
		this("Esmond");
		Debugger.debug();
		this.age = age;
	}
	
	public Student(String name) {
		this(14,"Plaza 8");
		Debugger.debug();
		this.name = name;
	}
	
	public Student(int studentID, String address) {
		Debugger.debug();
		this.studentID = studentID;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", studentID=" + studentID
				+ ", address=" + address + "]";
	}
	
}

public class Example11 {

	public static void main(String[] args) { 
//		List<Student> students = new ArrayList<Student>();
//		students.add(new Student(23));
//		students.add(new Student("Esmond"));
//		students.add(new Student(41, "Changi Biz Park"));
//		for(Student student : students) {
//			System.out.println(student);
//		}
		Student esmond = new Student(27);
		System.out.println(esmond);
	}

}
