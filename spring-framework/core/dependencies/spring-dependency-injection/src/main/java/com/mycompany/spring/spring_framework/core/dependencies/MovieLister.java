/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies;

/**
 * @author colin
 *
 */
public class MovieLister {

	// this class has a dependency on MovieFinder
	private MovieFinder movieFinder;
	
	/**
	 * 
	 */
	public void listMovies(){
		//movieFinder.getMovies();
	}
	
	public static MovieLister createInstance(MovieFinder movieFinder){
		return new MovieLister();
	}
	
}
