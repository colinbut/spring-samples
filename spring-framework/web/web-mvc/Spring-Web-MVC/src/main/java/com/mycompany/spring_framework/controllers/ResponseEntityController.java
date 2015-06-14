/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author colin
 *
 */
@Controller
public class ResponseEntityController {

	@RequestMapping("/something")
	public ResponseEntity<String> handle(HttpEntity<byte[]> requestEntity) {
		
		String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
		byte[] requestBody = requestEntity.getBody();
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("MyResponseHeader","MyValue");
		
		return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
	}
}
