/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import java.net.URI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author colin
 *
 */
@Controller
public class UriBuilderController {

	@RequestMapping(value = "/uriBuilder", method=RequestMethod.GET)
	public String showUriBuilderController() {
		
		UriComponents uriComponents = UriComponentsBuilder.fromUriString(""
				+ "http://localhost:8080/springwebmvc/hotels/{hotel}/bookings/{booking}").build();
		
		URI uri = uriComponents.expand("42", "21").encode().toUri();
		
		System.out.println(uri.toString());
		
		return "uriBuilder";
	}
}
