/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.service;

import com.mycompany.spring.spring_framework.ioc.model.Class;

/**
 * A service to get Class information from the application
 * 
 * @author colin
 *
 */
public interface ClassService {

	/**
	 * Gets the Class data
	 * 
	 * @return
	 */
	Class getClassDetails();
}
