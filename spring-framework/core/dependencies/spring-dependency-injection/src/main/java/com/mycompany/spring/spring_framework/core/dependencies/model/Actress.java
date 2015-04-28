/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

/**
 * @author colin
 *
 */
public class Actress extends Cast implements Artist {

	public Actress(String name, int age){
		setName(name);
		setAge(age);
	}
}
