/**
 * 
 */
package com.mycompany.spring.spring_framework.core.beans.onlinestore.model;

/**
 * A book
 * 
 * @author colin
 *
 */
public class Book {

	private String title;
	private String ISBN;
	private String[] authors;
	private boolean hardback;
	
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
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}
	
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	/**
	 * @return the authors
	 */
	public String[] getAuthors() {
		return authors;
	}
	
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	/**
	 * @return the hardback
	 */
	public boolean isHardback() {
		return hardback;
	}
	
	/**
	 * @param hardback the hardback to set
	 */
	public void setHardback(boolean hardback) {
		this.hardback = hardback;
	}
	
	
	
}
