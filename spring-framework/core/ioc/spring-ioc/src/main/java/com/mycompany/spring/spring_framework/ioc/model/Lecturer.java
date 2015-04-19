/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author colin
 *
 */
public class Lecturer extends Person {

	private List<Class> teachingClasses;
	
	public Lecturer(){
		teachingClasses = new ArrayList<>();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return super.getName();
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		super.setName(name);
	}
	
	/**
	 * @param newClass 
	 */
	public void teachClass(Class newClass){
		teachingClasses.add(newClass);
	}

	/**
	 * @return the teachingClasses
	 */
	public List<Class> getTeachingClasses() {
		return teachingClasses;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "Lecturer{"+name+"}";
	}
}
