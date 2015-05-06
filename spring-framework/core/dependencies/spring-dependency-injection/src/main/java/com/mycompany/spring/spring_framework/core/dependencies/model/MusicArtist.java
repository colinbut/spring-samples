/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

/**
 * A musician (music artist)
 * 
 * - Singer
 * - Rapper
 * - etc...
 * 
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

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the yearBecameActive
	 */
	public int getYearBecameActive() {
		return yearBecameActive;
	}

	/**
	 * @param yearBecameActive the yearBecameActive to set
	 */
	public void setYearBecameActive(int yearBecameActive) {
		this.yearBecameActive = yearBecameActive;
	}
	
	
}
