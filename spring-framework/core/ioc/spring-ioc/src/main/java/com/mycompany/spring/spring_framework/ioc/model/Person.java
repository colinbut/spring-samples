/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.model;

/**
 * A person i.e. human being
 * 
 * @author colin
 *
 */
public abstract class Person {

	protected String name;
	
	/**
	 * Person's name
	 * 
	 * @return the name
	 */
	protected String getName() {
		return name;
	}

	/**
	 * Sets the person's name
	 * 
	 * @param name the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}
}
