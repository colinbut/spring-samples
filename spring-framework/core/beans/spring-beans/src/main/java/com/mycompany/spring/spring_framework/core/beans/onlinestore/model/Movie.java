/**
 * 
 */
package com.mycompany.spring.spring_framework.core.beans.onlinestore.model;

/**
 * A movie
 * 
 * @author colin
 *
 */
public class Movie {

	private String title;
	private String director;
	private String producer;
	private String[] cast;
	
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
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	
	/**
	 * @return the producer
	 */
	public String getProducer() {
		return producer;
	}
	
	/**
	 * @param producer the producer to set
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	/**
	 * @return the cast
	 */
	public String[] getCast() {
		return cast;
	}
	
	/**
	 * @param cast the cast to set
	 */
	public void setCast(String[] cast) {
		this.cast = cast;
	}
}
