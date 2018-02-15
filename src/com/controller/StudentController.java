package com.controller;

import com.dao.StudentDAO;
import com.model.Student;

public class StudentController {
	
	private StudentDAO refStudentDAO;
	
	public void studentLogic(Student refStudent) {
		refStudentDAO = new StudentDAO();
		if (refStudentDAO.loginAuthentication(refStudent)) {
			System.out.println("Login Success");
		} else {
				System.out.println("Login Failed");
		}
	}

} // end of StudentController
