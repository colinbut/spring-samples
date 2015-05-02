/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations.model;

import javax.annotation.Resource;

/**
 * @author colin
 *
 */
public class AdvancedMovieLister {

	private MovieFinder movieFinder;
	
	private SimpleMovieLister simpleMovieLister; // composes a SimpleMovieLister to do some basic jobs
	
	// JSR-250 annotation (Java EE5/6) 
	// alternative to Autowired injection
	@Resource(name="myAdvancedMovieFinder")
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	@Resource
	public void setSimpleMovieLister(SimpleMovieLister simpleMovieLister){
		this.simpleMovieLister = simpleMovieLister;
	}
}
