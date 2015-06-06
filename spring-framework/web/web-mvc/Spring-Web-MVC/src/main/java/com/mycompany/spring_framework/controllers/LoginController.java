/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.spring_framework.model.UserLogin;

/**
 * @author colin
 *
 */
@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView viewLoginPage() {
		ModelAndView modelAndView = new ModelAndView("login", "command", new UserLogin());
		return modelAndView;
	}
	
	@RequestMapping(value="/loginUser", method=RequestMethod.POST)
	public String login(@ModelAttribute("spring-web-mvc") ModelMap model) {
		
		//redirect to studentDetails view
		return "redirect:viewStudent";
	}
}
