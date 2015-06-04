/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author colin
 *
 */
@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String viewLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/loginSubmit", method=RequestMethod.POST)
	public String login() {
		return "studentDetails";
	}
}
