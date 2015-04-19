/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.service;

import java.sql.SQLException;

import com.mycompany.spring.spring_framework.ioc.dao.StudentDao;
import com.mycompany.spring.spring_framework.ioc.model.Student;

/**
 * Implementation of the StudentService
 * 
 * @author colin
 *
 */
public class StudentServiceImpl implements StudentService {

	private StudentDao dao;
	
	/**
	 * Constructor
	 * 
	 * @param dao
	 */
	public StudentServiceImpl(StudentDao dao) {
		this.dao = dao;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.ioc.service.StudentService#getStudent()
	 */
	@Override
	public Student getStudent() {
		
		Student student = null;
		
		try {
			student = dao.getStudent();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e){
			// swallowing exceptions (possible NullPointerExceptions)
		}
		
		return student;
	}

}
