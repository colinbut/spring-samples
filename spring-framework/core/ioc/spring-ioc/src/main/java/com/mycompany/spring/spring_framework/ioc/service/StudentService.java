/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.service;

import com.mycompany.spring.spring_framework.ioc.model.Student;

/**
 * A service to get the student data from the application
 * 
 * @author colin
 *
 */
public interface StudentService {

	/**
	 * Gets the student
	 *  
	 * @return student
	 */
	Student getStudent();
	
}
