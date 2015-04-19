/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.mycompany.spring.spring_framework.ioc.model.Student;

/**
 * Implementation of the StudentDao
 * 
 * @author colin
 *
 */
public class StudentDaoImpl implements StudentDao {

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.ioc.dao.StudentDao#getStudent()
	 */
	@Override
	public Student getStudent() throws SQLException {
		
		// TODO: make db connection to get data
		Student student = new Student();
		student.setStudentId(1);
		student.setName("Student Name");
		
		try {
			student.setDateOfBirth(new SimpleDateFormat("DD-MM-YYYY").parse("01-03-1990"));
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
		
		return student;
	}
	

}
