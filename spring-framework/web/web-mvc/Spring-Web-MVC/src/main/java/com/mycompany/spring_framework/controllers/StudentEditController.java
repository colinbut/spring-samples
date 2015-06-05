/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.spring_framework.model.StudentRegistration;

/**
 * @author colin
 *
 */
@Controller
public class StudentEditController {

	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView student() {
		
		ModelAndView modelAndView = new ModelAndView("studentEdit", "command", new StudentRegistration());
		modelAndView.addObject("sexList", new ArrayList<String>(){{add("Male");add("Female");}});
		modelAndView.addObject("marketingOptions", new ArrayList<String>(){{add("Email");add("Newsletters");}});
		
		
		return modelAndView;
	}
	
	@RequestMapping(value="/registerStudent", method=RequestMethod.POST)
	public String registerStudent(@ModelAttribute StudentRegistration studentRegistration,
			ModelMap model) {
		
		model.addAttribute("surname", studentRegistration.getSurname());
		model.addAttribute("age", studentRegistration.getAge());
		
		return "studentDetails";
	}
}
