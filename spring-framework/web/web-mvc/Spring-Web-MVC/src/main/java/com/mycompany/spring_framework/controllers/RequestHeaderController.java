/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author colin
 *
 */
@Controller
public class RequestHeaderController {

	@RequestMapping(value = "displayHeaderInfoRequestHeader", method=RequestMethod.GET)
	public void displayHeaderInfo (
			@RequestHeader("Host") String host,
			@RequestHeader("Accept") String accept,
			@RequestHeader("Accept-Language") String accept_language,
			@RequestHeader("Accept-Encoding") String encoding,
			@RequestHeader("Accept-Charset") String accept_charset,
			@RequestHeader("Keep-Alive") long keepAlive	) {
		
		System.out.println(host);
		System.out.println(accept);
		System.out.println(accept_language);
		System.out.println(encoding);
		System.out.println(accept_charset);
		System.out.println(keepAlive);
		
	}
}
