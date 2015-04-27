/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.dao;

import java.util.List;

import com.mycompany.spring.spring_framework.core.dependencies.model.Movie;
import com.mycompany.spring.spring_framework.core.dependencies.storage.MovieDatabase;

/**
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
	
	@Override
	public List<Movie> getMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie getMovieByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie getMovieById() {
		// TODO Auto-generated method stub
		return null;
	}

}
