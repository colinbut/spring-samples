/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.model;

/**
 * @author colin
 *
 */
public abstract class Person {

	protected String name;
	
	/**
	 * @return the name
	 */
	protected String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}
}
