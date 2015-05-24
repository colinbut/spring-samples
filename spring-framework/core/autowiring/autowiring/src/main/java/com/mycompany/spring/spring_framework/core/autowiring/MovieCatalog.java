/**
 * 
 */
package com.mycompany.spring.spring_framework.core.autowiring;

import org.springframework.stereotype.Component;


/**
 * @author colin
 *
 */
@Component
public class MovieCatalog {

	private Movie[] movies;
	
	/**
	 * Constructor
	 */
	public MovieCatalog(){
		init();
	}
	
	/**
	 * Initialisation
	 */
	public void init(){
		movies = new Movie[]{
				new Movie("Batman", 1990),
				new Movie("Batman Returns", 1992)
		};
	}
	
	/**
	 * Get a list of movies
	 * 
	 * @return
	 */
	public Movie[] getMovies(){
		return movies;
	}
	
}
