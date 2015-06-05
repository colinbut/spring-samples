/**
 * 
 */
package com.mycompany.spring_framework.model;

import java.util.List;

/**
 * @author colin
 *
 */
public class StudentRegistration {

	private String surname;
	private String forename;
	private String middlenames;
	private int age;
	private String title;
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the marketing
	 */
	public String getMarketing() {
		return marketing;
	}
	/**
	 * @param marketing the marketing to set
	 */
	public void setMarketing(String marketing) {
		this.marketing = marketing;
	}
	/**
	 * @return the additionalInfo
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	/**
	 * @param additionalInfo the additionalInfo to set
	 */
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	private String sex;
	private String marketing;
	private String additionalInfo;
	
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
	 * @return the middleNames
	 */
	public String getMiddlenames() {
		return middlenames;
	}
	/**
	 * @param middleNames the middleNames to set
	 */
	public void setMiddlenames(String middlenames) {
		this.middlenames = middlenames;
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
}
