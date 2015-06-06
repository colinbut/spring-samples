/**
 * 
 */
package com.mycompany.spring_framework.service;

import com.mycompany.spring_framework.model.StudentRegistration;

/**
 * @author colin
 *
 */
public interface StudentRegistrationService {

	boolean registerStudent(StudentRegistration student);
	
	StudentRegistration getStudentRegistration();
}
