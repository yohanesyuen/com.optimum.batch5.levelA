package day01;

class Student {
	int studentID;
	String student_Name;
	
	void accessStudentID(int studentID, String student_Name) {
		this.studentID = studentID;
		this.student_Name = student_Name;
	} // end of accessStudentID
	
	void displayStudentID() {
		System.out.println(studentID + " " + student_Name);
	} // end of displayStudentID
} // end of Student

public class Example05 {

	public static void main(String[] args) {
		Student refStudent = new Student();
		refStudent.accessStudentID(1020, "boon");
		refStudent.displayStudentID();
	} // end of main

} // end of Example05
