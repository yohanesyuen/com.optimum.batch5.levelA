package com.application;

import java.util.Scanner;

import com.controller.StudentController;
import com.model.Student;

public class StudentApplication {

	public static void main(String[] args) {
		
		StudentController refStudentController = new StudentController();
		
		Scanner sc = new Scanner(System.in);
		
		Student refStudent = new Student();
		refStudent.setStudentName(sc.next());

		refStudentController.studentLogic(refStudent);
		sc.close();
	}

}
