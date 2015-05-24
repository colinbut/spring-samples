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
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

}
