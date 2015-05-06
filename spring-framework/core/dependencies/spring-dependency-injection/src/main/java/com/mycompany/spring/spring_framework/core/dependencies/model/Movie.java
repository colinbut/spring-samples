/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

/**
 * A Movie
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

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the cast
	 */
	public Cast[] getCast() {
		return cast;
	}

	/**
	 * @param cast the cast to set
	 */
	public void setCast(Cast[] cast) {
		this.cast = cast;
	}

	/**
	 * @return the producer
	 */
	public Producer getProducer() {
		return producer;
	}

	/**
	 * @param producer the producer to set
	 */
	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	/**
	 * @return the director
	 */
	public Director getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(Director director) {
		this.director = director;
	}
	
	
	
}
