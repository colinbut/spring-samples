/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author colin
 *
 */
public class Actor extends Cast {

	private List<Movie> filmography;
	
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
}
