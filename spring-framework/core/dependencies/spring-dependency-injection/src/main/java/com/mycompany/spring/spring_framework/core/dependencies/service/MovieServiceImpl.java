/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.service;

import java.util.List;

import com.mycompany.spring.spring_framework.core.dependencies.dao.MovieDao;
import com.mycompany.spring.spring_framework.core.dependencies.model.Movie;

/**
 * Implementation of MovieService
 * 
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
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.core.dependencies.service.MovieService#getMovieByTitle()
	 */
	@Override
	public Movie getMovieByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.core.dependencies.service.MovieService#getMovies()
	 */
	@Override
	public List<Movie> getMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.core.dependencies.service.MovieService#getMovieById()
	 */
	@Override
	public Movie getMovieById() {
		// TODO Auto-generated method stub
		return null;
	}

}
