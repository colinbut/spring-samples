/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author colin
 *
 */
public class BookCatalog {
	
	// Autowiring collection typed
	
	// @Autowired?
	private List<Book> books;
	
	@Autowired(required=false)
	public void setBooks(List<Book> books){
		this.books = books;
	}

	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}
}
