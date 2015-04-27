/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;


/**
 * @author colin
 *
 */
public class Movie {

	private String title;
	private int year;
	private Cast[] cast;
	private Producer producer;
	private Director director;
	
	/**
	 * Constructor
	 * 
	 * @param title
	 * @param year
	 * @param cast
	 * @param producer
	 * @param director
	 */
	public Movie(String title, int year, Cast[] cast, Producer producer,
			Director director) {
		this.title = title;
		this.year = year;
		this.cast = cast;
		this.producer = producer;
		this.director = director;
	}
	
	
	
}
