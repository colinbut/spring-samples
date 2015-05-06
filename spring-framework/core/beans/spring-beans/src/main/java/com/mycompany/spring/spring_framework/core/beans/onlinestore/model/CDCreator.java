/**
 * 
 */
package com.mycompany.spring.spring_framework.core.beans.onlinestore.model;

/**
 * A class to create CDs
 * 
 * @author colin
 *
 */
public class CDCreator {

	private CD cd = new CD();
	
	/**
	 * Constructor
	 */
	public CDCreator(){
		//
	}
	
	/**
	 * Creates a CD
	 * 
	 * @return CD
	 */
	public CD createCD(){
		return cd;
	}
}
