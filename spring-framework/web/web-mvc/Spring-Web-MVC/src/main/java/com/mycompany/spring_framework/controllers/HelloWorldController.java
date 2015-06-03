/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author colin
 *
 */
@Controller
public class HelloWorldController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String displayHelloWorld(Model model) {
		model.addAttribute("message","World");
		return "hello";
	}
}
