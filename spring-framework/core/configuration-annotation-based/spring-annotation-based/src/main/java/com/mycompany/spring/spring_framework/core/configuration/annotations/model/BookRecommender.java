/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.mycompany.spring.spring_framework.core.configuration.annotations.dao.BookDao;

/**
 * @author colin
 *
 */
public class BookRecommender {

	// Autowiring on Fields
	
	@Autowired
	private BookCatalog bookCatalog;
	
	@Autowired
	private BookCatalog[] archiveBookCatalogs;
	
	@Autowired
	private ApplicationContext context;
	
	private BookDao bookDao;
	
	// Autowiring on Constructors
	
	@Autowired
	public BookRecommender(BookDao bookDao){
		this.bookDao = bookDao;
	}
}
