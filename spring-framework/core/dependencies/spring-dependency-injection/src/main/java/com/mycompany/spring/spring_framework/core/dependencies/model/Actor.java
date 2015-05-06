/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

import java.util.ArrayList;
import java.util.List;

/**
 * An Actor
 * 
 * @author colin
 *
 */
public class Actor extends Cast implements Artist {

	private List<Movie> filmography;
	private String email;
	
	/**
	 * Constructor
	 * 
	 * @param name
	 * @param age
	 */
	public Actor(String name, int age){
		setName(name);
		setAge(age);
		filmography = new ArrayList<>();
	}
	
	/**
	 * Gets the email address
	 * 
	 * @return
	 */
	public String getEmail(){
		return email;
	}
	
	/**
	 * Sets the email address
	 * 
	 * @param email
	 */
	public void setEmail(String email){
		this.email = email;
	}
}
