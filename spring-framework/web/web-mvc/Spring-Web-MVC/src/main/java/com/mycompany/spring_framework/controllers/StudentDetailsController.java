/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.spring_framework.model.StudentRegistration;
import com.mycompany.spring_framework.service.StudentRegistrationService;

/**
 * @author colin
 *
 */
@Controller
public class StudentDetailsController {

	@Autowired
	private StudentRegistrationService studentRegistrationService;
	
	
	@RequestMapping(value="/viewStudent", method=RequestMethod.GET)
	public String viewStudentDetails(ModelMap model) {

		StudentRegistration studentRegistration = studentRegistrationService.getStudentRegistration();
		
		if(studentRegistration != null) {
			// populate the model
			model.addAttribute("surname", studentRegistration.getSurname());
			model.addAttribute("age", studentRegistration.getAge());
			model.addAttribute("forename", studentRegistration.getForename());
			model.addAttribute("middlenames", studentRegistration.getMiddlenames());
			model.addAttribute("title", studentRegistration.getTitle());
			model.addAttribute("sex", studentRegistration.getSex());
			model.addAttribute("marketing", studentRegistration.getMarketing());
			model.addAttribute("additionalInfo", studentRegistration.getAdditionalInfo());
			
		}
		
		// return the view (name)
		return "studentDetails";
	}
}
