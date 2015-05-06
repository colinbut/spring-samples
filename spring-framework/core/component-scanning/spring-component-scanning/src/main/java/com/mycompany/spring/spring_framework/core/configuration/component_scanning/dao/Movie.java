/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.component_scanning.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author colin
 *
 */
@Component
@Scope("prototype")
public class Movie {

	private String title;
	private int year;

}
