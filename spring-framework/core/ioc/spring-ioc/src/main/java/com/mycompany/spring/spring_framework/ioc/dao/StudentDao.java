package com.mycompany.spring.spring_framework.ioc.dao;

import java.sql.SQLException;

import com.mycompany.spring.spring_framework.ioc.model.Student;

/**
 * Data Access Object for the Student 
 * 
 * @author colin
 *
 */
public interface StudentDao {

	/**
	 * Gets the student data from the database
	 * 
	 * @return
	 * @throws SQLException
	 */
	Student getStudent() throws SQLException;
}
