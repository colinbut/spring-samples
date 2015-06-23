/**
 * 
 */
package com.mycompany.spring_framework.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mycompany.spring_framework.model.Registration;

/**
 * Custom Validator
 * 
 * @author colin
 *
 */
@Component
public class RegistrationValidator implements Validator{

	@Override
	public boolean supports(Class<?> c1) {
		return Registration.class.isAssignableFrom(c1);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		Registration registration = (Registration) object;
		
		if(registration.getUsername() == null || registration.getUsername().length() == 0) {
			errors.rejectValue("username", "error.empty.username");
		}
		
		if(registration.getPassword() == null || registration.getPassword().length() == 0) {
			errors.rejectValue("password", "error.empty.password");
		}
		
		if(registration.getFirstName() == null || registration.getFirstName().length() == 0) {
			errors.rejectValue("firstName", "error.empty.firstname");
		}
		
		if(registration.getLastName() == null || registration.getLastName().length() == 0) {
			errors.rejectValue("lastName", "error.empty.lastname");
		}
		
		if(registration.getGender() == null || registration.getGender().length() == 0) {
			errors.rejectValue("gender", "error.empty.gender");
		}
		
		if(registration.getAddress() == null || registration.getAddress().length() == 0) {
			errors.rejectValue("address", "error.empty.address");
		}
	}

}
