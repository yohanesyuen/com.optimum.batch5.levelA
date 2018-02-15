package com.dao;

import com.model.Student;

// DAO (Data Access Object)
public class StudentDAO {
	private boolean status;

	public boolean loginAuthentication(Student refStudent) {
		if(refStudent.getStudentName().equals("admin")) {
			// connect with database (mysql)
			status = true;
		} else {
			status = false;
		}
		return status;
	}
} // end of StudentDAO
