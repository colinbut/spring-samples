/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Lecturer
 * 
 * @author colin
 *
 */
public class Lecturer extends Person {

	private List<Class> teachingClasses;
	
	public Lecturer(){
		teachingClasses = new ArrayList<>();
	}

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.ioc.model.Person#getName()
	 */
	public String getName() {
		return super.getName();
	}

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.ioc.model.Person#setName(java.lang.String)
	 */
	public void setName(String name) {
		super.setName(name);
	}
	
	/**
	 * Adds the <newClass> to this lecturer's list of teaching classes
	 * 
	 * @param newClass 
	 */
	public void teachClass(Class newClass){
		teachingClasses.add(newClass);
	}

	/**
	 * Gets all the classes this lecturer teaches
	 * 
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
