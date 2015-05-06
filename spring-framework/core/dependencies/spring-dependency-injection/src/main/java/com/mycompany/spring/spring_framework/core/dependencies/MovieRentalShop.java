/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies;

/**
 * A movie rental shop where it lends movies for rent
 * 
 * @author colin
 *
 */
public class MovieRentalShop {

	private MovieLister movieLister;
	
	/**
	 * Sets the movie lister
	 * 
	 * @param movieLister
	 */
	public void setMovieLister(MovieLister movieLister){
		this.movieLister = movieLister;
	}
}
