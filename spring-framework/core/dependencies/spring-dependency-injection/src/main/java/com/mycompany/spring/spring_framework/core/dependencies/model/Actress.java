/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

/**
 * An Actress
 * 
 * @author colin
 *
 */
public class Actress extends Cast implements Artist {

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param age
	 */
	public Actress(String name, int age){
		setName(name);
		setAge(age);
	}
}
