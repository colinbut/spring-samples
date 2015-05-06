/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class
 * 
 * @author colin
 *
 */
public class Class {

	private String name;
	
	private List<Student> students;
	
	private List<Lecturer> lecturers;

	/**
	 * Constructor
	 */
	public Class(){
		students = new ArrayList<Student>();
		lecturers = new ArrayList<Lecturer>();
	}
	
	/**
	 * Gets number of students that belongs to this class
	 * 
	 * @return no. of students
	 */
	public int getNumberOfStudents(){
		return students.size();
	}
	
	/**
	 * Get the lecturers who lectures this class
	 * 
	 * @return the lecturers
	 */
	public List<Lecturer> getLecturers(){
		return lecturers;
	}
	
	/**
	 * Enrols a student onto this class
	 * 
	 * @param student the Student to enrol
	 */
	public void enrolStudent(Student student){
		students.add(student);
	}
	
	/**
	 * Gets the students of this class
	 * 
	 * @return list of students in class
	 */
	public List<Student> getStudents(){
		return students;
	}
	
	
	/**
	 * Gets the class
	 * 
	 * @return the name 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the class name
	 * 
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
