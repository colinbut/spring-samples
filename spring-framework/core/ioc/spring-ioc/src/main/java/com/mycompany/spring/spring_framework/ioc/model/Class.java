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
public class Class {

	private String name;
	
	private List<Student> students;
	
	private List<Lecturer> lecturers;

	public Class(){
		students = new ArrayList<Student>();
		lecturers = new ArrayList<Lecturer>();
	}
	
	/**
	 * 
	 * @return
	 */
	public int getNumberOfStudents(){
		return students.size();
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Lecturer> getLecturers(){
		return lecturers;
	}
	
	/**
	 * 
	 * @param student
	 */
	public void enrolStudent(Student student){
		students.add(student);
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Student> getStudents(){
		return students;
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
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "Class{"+name+"}";
	}
}
