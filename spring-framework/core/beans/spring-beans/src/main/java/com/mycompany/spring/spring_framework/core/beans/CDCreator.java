/**
 * 
 */
package com.mycompany.spring.spring_framework.core.beans;

/**
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
	
	public CD createCD(){
		return cd;
	}
}
