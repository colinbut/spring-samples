/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.model;

import java.util.Date;

/**
 * A student
 * 
 * @author colin
 *
 */
public class Student extends Person{

	private int studentId;
	
	private Date dateOfBirth;

	/**
	 * Constructor
	 */
	public Student(){
		//
	}
	
	/**
	 * Gets the studentId of this student
	 * 
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * Sets the studentId of this student
	 * 
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	 * Gets the DOB of this student
	 * 
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * Sets the DOB of this student
	 * 
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "Student{"+studentId+":"+name+":"+dateOfBirth+"}";
	}
}
