/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author colin
 *
 */
@Controller
public class CookieValueController {
	
	@RequestMapping(value="/displayHeaderInfo")
	public void displayHeaderInfo(@CookieValue("JSESSIONID") String cookie) {
		System.out.println(cookie);
	}
}
