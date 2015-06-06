/**
 * 
 */
package com.mycompany.spring_framework.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.spring_framework.model.StudentRegistration;

/**
 * @author colin
 *
 */
@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	private List<StudentRegistration> studentRegistrations;
	
	public StudentRegistrationServiceImpl() {
		studentRegistrations = new ArrayList<StudentRegistration>();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring_framework.service.StudentRegistrationService#registerStudent(com.mycompany.spring_framework.model.StudentRegistration)
	 */
	@Override
	public boolean registerStudent(StudentRegistration student) {
		studentRegistrations.add(student);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring_framework.service.StudentRegistrationService#getStudentRegistration()
	 */
	@Override
	public StudentRegistration getStudentRegistration() {
		if(!studentRegistrations.isEmpty()) {
			return studentRegistrations.get(0);
		}
		else {
			return null;
		}
	}
	
	

}
