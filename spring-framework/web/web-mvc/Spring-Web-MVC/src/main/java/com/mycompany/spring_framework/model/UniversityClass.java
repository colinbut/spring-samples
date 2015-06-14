/**
 * 
 */
package com.mycompany.spring_framework.model;

/**
 * @author colin
 *
 */
public class UniversityClass {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UniversityClass [name=" + name + ", semester=" + semester + "]";
	}

	private String name;
	
	private Semester semester;

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
	 * @return the semester
	 */
	public Semester getSemester() {
		return semester;
	}

	/**
	 * @param semester the semester to set
	 */
	public void setSemester(Semester semester) {
		this.semester = semester;
	}
}
