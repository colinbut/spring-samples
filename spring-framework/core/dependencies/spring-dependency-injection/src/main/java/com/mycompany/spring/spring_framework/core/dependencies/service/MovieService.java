/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.service;

import java.util.List;

import com.mycompany.spring.spring_framework.core.dependencies.model.Movie;

/**
 * A service for getting Movie(s)
 * 
 * @author colin
 *
 */
public interface MovieService {

	/**
	 * Gets a movie by title
	 * 
	 * @return a Movie
	 */
	Movie getMovieByTitle();
	
	/**
	 * Gets a list of movies
	 * 
	 * @return list of movies
	 */
	List<Movie> getMovies();
	
	/**
	 * Gets a movie by id
	 * 
	 * @return a Movie
	 */
	Movie getMovieById();
}
