/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.service;

import java.util.List;

import com.mycompany.spring.spring_framework.core.dependencies.model.Movie;

/**
 * @author colin
 *
 */
public interface MovieService {

	Movie getMovieByTitle();
	
	List<Movie> getMovies();
	
	Movie getMovieById();
}
