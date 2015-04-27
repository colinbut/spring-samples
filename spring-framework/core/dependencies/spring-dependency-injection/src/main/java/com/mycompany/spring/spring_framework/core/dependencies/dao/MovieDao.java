/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.dao;

import java.util.List;

import com.mycompany.spring.spring_framework.core.dependencies.model.Movie;

/**
 * @author colin
 *
 */
public interface MovieDao {

	List<Movie> getMovies();
	
	Movie getMovieByTitle();
	
	Movie getMovieById();
}
