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
public class LocaleController {

	@RequestMapping(value="/locale", method=RequestMethod.GET)
	public String displayLocalePage() {
		return "locale";
	}
}
