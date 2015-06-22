/**
 * 
 */
package com.mycompany.spring_framework.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mycompany.spring_framework.model.Registration;

/**
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
	}

}
