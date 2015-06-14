/**
 * 
 */
package com.mycompany.spring_framework.model;

/**
 * @author colin
 *
 */
public enum Semester {

	SEMESTER_1("Semester 1"),
	
	SEMESTER_2("Semester 2"),
	
	SEMESTER_3("Semester 3");
	
	private Semester(String semester) {
		this.semester = semester;
	}
	
	private String semester;

	/**
	 * @return the semester
	 */
	public String getSemester() {
		return semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(String semester) {
		this.semester = semester;
	}
}
