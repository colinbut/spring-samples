/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.service;

import com.mycompany.spring.spring_framework.ioc.model.Lecturer;

/**
 * A service to retrieve Lecturer information from the application
 * 
 * @author colin
 *
 */
public interface LecturerService {

	/**
	 * Gets the Lecturer data
	 * 
	 * @return
	 */
	Lecturer getLecturer();
}
