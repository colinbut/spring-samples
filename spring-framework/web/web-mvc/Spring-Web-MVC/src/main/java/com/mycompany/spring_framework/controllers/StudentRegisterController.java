/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.spring_framework.model.StudentRegistration;
import com.mycompany.spring_framework.service.StudentRegistrationService;

/**
 * @author colin
 *
 */
@Controller
public class StudentRegisterController {

	@Autowired
	private StudentRegistrationService studentRegistrationService;
	
	@RequestMapping(value="/viewRegistration", method=RequestMethod.GET)
	public ModelAndView viewRegistrationPage() {
		
		ModelAndView modelAndView = new ModelAndView("studentRegister", "command", new StudentRegistration());
		
		List<String> titles = new ArrayList<String>();
		titles.add("Mr");
		titles.add("Mrs");
		titles.add("Ms");
		titles.add("Miss");
		
		List<String> sexList = new ArrayList<String>();
		sexList.add("Male");
		sexList.add("Female");
		
		List<String> marketingOptions = new ArrayList<>();
		marketingOptions.add("Emails");
		marketingOptions.add("Newsletters");
		marketingOptions.add("Telephone calls");
		
		modelAndView.addObject("titles", titles);
		modelAndView.addObject("sexList", sexList);
		modelAndView.addObject("marketingOptions", marketingOptions);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/registerStudent", method=RequestMethod.POST)
	public String submitRegistration(@ModelAttribute StudentRegistration studentRegistration) {
		
		if(studentRegistrationService.registerStudent(studentRegistration)) {
			return "redirect:viewStudent"; // redirect to student details view
		}
		
		// should go back to home page
		return "studentDetails";
	}
}
