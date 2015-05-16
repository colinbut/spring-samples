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
	
	public MovieCatalog(){
		init();
	}
	
	public void init(){
		movies = new Movie[]{
				new Movie("Batman", 1990),
				new Movie("Batman Returns", 1992)
		};
	}
	
	public Movie[] getMovies(){
		return movies;
	}
	
}
