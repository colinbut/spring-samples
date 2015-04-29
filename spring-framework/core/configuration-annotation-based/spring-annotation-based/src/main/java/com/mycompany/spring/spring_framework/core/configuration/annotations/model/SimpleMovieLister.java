/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * @author colin
 *
 */
public class SimpleMovieLister {

	private MovieFinder movieFinder;
	
	// Autowiring on Setter 
	// Required denotes this injection is a must
	
	@Required
	@Autowired
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
}
