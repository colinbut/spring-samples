/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.service;

import java.util.List;

import com.mycompany.spring.spring_framework.core.dependencies.dao.MovieDao;
import com.mycompany.spring.spring_framework.core.dependencies.model.Movie;

/**
 * @author colin
 *
 */
public class MovieServiceImpl implements MovieService {

	private MovieDao movieDao;
	
	// Setter Dependency Injection
	
	/**
	 * Sets the movieDao
	 * 
	 * @param movieDao
	 */
	public void setMovieDao(MovieDao movieDao){
		this.movieDao = movieDao;
	}
	
	@Override
	public Movie getMovieByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie getMovieById() {
		// TODO Auto-generated method stub
		return null;
	}

}
