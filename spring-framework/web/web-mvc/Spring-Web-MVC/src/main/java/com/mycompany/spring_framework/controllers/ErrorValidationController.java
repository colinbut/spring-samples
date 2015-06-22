/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.spring_framework.model.Registration;
import com.mycompany.spring_framework.validator.RegistrationValidator;

/**
 * @author colin
 *
 */
@Controller
public class ErrorValidationController {

	@Autowired
	private RegistrationValidator registrationValidator;
	
	/**
	 * This method is to show the form
	 * 
	 * @param registration
	 * @return
	 */
	@RequestMapping(value="/errorValidation", method=RequestMethod.GET)
	public String showForm(Registration registration) {
		return "errorValidation-registrationForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String submitRegistration(Model model, Registration registration, BindingResult result){
		
		registrationValidator.validate(registration, result);
		
		if(!result.hasErrors()) {
			model.addAttribute("username",registration.getUsername());
			model.addAttribute("password", registration.getPassword());
			model.addAttribute("lastname", registration.getLastName());
			model.addAttribute("firstname", registration.getFirstName());
			model.addAttribute("gender", registration.getGender());
			model.addAttribute("country", registration.getCountry());
			model.addAttribute("address", registration.getAddress());
			model.addAttribute("cb", registration.getCb());
		}
		else {
			System.out.println("Has Errors");
			return "errorValidation-registrationForm";
		}
		
		
		return "errorValidation-showSubmittedForm";
	}
}
