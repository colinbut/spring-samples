/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author colin
 *
 */
public class Book {

	private String title;
	private List<String> authors;
	private Map<Integer, Integer> editions;
	private Set<String> publishers;
	
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
	 * @return the authors
	 */
	public List<String> getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	/**
	 * @return the editions
	 */
	public Map<Integer, Integer> getEditions() {
		return editions;
	}
	/**
	 * @param editions the editions to set
	 */
	public void setEditions(Map<Integer, Integer> editions) {
		this.editions = editions;
	}
	/**
	 * @return the publishers
	 */
	public Set<String> getPublishers() {
		return publishers;
	}
	/**
	 * @param publishers the publishers to set
	 */
	public void setPublishers(Set<String> publishers) {
		this.publishers = publishers;
	}
	
	
}
