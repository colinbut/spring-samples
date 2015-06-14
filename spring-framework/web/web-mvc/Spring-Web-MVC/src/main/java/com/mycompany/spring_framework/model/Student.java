/**
 * 
 */
package com.mycompany.spring_framework.model;

import java.util.List;

/**
 * @author colin
 *
 */
public class Student {

	private int studentId;
	private String surname;
	private String middlenames;
	private String forename;
	private int age;
	private String address;
	private int yearOfStudy;
	private List<UniversityClass> classes;
	
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * @return the middlenames
	 */
	public String getMiddlenames() {
		return middlenames;
	}
	
	/**
	 * @param middlenames the middlenames to set
	 */
	public void setMiddlenames(String middlenames) {
		this.middlenames = middlenames;
	}
	
	/**
	 * @return the forename
	 */
	public String getForename() {
		return forename;
	}
	
	/**
	 * @param forename the forename to set
	 */
	public void setForename(String forename) {
		this.forename = forename;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the yearOfStudy
	 */
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	
	/**
	 * @param yearOfStudy the yearOfStudy to set
	 */
	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	
	/**
	 * @return the classes
	 */
	public List<UniversityClass> getClasses() {
		return classes;
	}
	
	/**
	 * @param classes the classes to set
	 */
	public void setClasses(List<UniversityClass> classes) {
		this.classes = classes;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", surname=" + surname
				+ ", middlenames=" + middlenames + ", forename=" + forename
				+ ", age=" + age + ", address=" + address + ", yearOfStudy="
				+ yearOfStudy + ", classes=" + classes + "]";
	}
}
