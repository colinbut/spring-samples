/**
 * 
 */
package com.mycompany.spring.spring_framework.core.autowiring;

/**
 * @author colin
 *
 */
public class Movie {

	private String title;
	private int year;
	
	/**
	 * Constructor
	 * 
	 * @param title
	 * @param year
	 */
	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
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

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "Movie[title:" + title + ",year:" + year + "]";
	}
}
