/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.dao;

import java.util.List;

import com.mycompany.spring.spring_framework.core.dependencies.model.Movie;
import com.mycompany.spring.spring_framework.core.dependencies.storage.MovieDatabase;

/**
 * Implementation of the MovieDao
 * 
 * @author colin
 *
 */
public class MovieDaoImpl implements MovieDao {

	private MovieDatabase movieDatabase;
	
	// constructor dependency injection
	
	/**
	 * Constructor
	 * 
	 * @param movieDatabase
	 */
	public MovieDaoImpl(MovieDatabase movieDatabase) {
		this.movieDatabase = movieDatabase;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.core.dependencies.dao.MovieDao#getMovies()
	 */
	@Override
	public List<Movie> getMovies() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.core.dependencies.dao.MovieDao#getMovieByTitle()
	 */
	@Override
	public Movie getMovieByTitle() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.core.dependencies.dao.MovieDao#getMovieById()
	 */
	@Override
	public Movie getMovieById() {
		return null;
	}

}
