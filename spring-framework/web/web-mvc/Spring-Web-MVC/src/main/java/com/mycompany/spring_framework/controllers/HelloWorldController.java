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
@RequestMapping("/example")
public class HelloWorldController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String displayHelloWorld() {
		return "Hello";
	}
}
