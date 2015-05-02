/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author colin
 *
 */
public class CachingMovieLister {

	@PostConstruct
	public void populateMovieCache(){
		System.out.println("Populating movie cache");
	}
	
	@PreDestroy
	public void clearMovieCache(){
		System.out.println("Clearing movie cache");
	}
}
