/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

/**
 * @author colin
 *
 */
public class MusicArtist implements Artist {

	private String name;
	private int age;
	private int yearBecameActive;
	
	/**
	 * Constructor
	 * 
	 * @param name
	 * @param age
	 * @param yearBecameActive
	 */
	public MusicArtist(String name, int age, int yearBecameActive) {
		this.name = name;
		this.age = age;
		this.yearBecameActive = yearBecameActive;
	}
	
	
}
