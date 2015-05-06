/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.dao;

import java.util.List;

import com.mycompany.spring.spring_framework.core.dependencies.model.Movie;

/**
 * Data Access Object for Movie  
 * 
 * @author colin
 *
 */
public interface MovieDao {

	/**
	 * Gets list of movies
	 * 
	 * @return list of movies
	 */
	List<Movie> getMovies();
	
	/**
	 * Gets a movie by its title
	 * 
	 * @return a Movie
	 */
	Movie getMovieByTitle();
	
	/**
	 * Gets movie by supplying id
	 * 
	 * @return a Movie
	 */
	Movie getMovieById();
}
