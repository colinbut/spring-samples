/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies;

import com.mycompany.spring.spring_framework.core.dependencies.service.MovieService;

/**
 * @author colin
 *
 */
public class MovieFinder {

	private MovieService movieService;
	
	
	/**
	 * Gets the movie database
	 * 
	 * @return
	 */
	public MovieService getMovieService(){
		return movieService;
	}
	
	// setter to demonstrate Setter Dependency Injection
	
	/**
	 * Sets the movie database
	 * 
	 * @param movieDatabase
	 */
	public void setMovieService(MovieService movieService){
		this.movieService = movieService;
	}
}
