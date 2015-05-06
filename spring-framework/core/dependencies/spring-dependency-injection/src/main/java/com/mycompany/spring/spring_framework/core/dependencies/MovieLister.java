/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies;

import java.util.List;

import com.mycompany.spring.spring_framework.core.dependencies.model.Movie;

/**
 * A class responsible for listing the movies
 * 
 * It uses MovieFinder to finds the movies first
 * 
 * @author colin
 *
 */
public class MovieLister {

	// this class has a dependency on MovieFinder
	private MovieFinder movieFinder;
	
	/**
	 * List the movies
	 */
	public List<Movie> listMovies(){
		return movieFinder.getMovieService().getMovies();
	}
	
	/**
	 * Static factory method to create instance of this class - MovieLister
	 * 
	 * @param movieFinder the movieFinder dependency
	 * @return instance of MovieLister
	 */
	public static MovieLister createInstance(MovieFinder movieFinder){
		return new MovieLister();
	}
	
}
