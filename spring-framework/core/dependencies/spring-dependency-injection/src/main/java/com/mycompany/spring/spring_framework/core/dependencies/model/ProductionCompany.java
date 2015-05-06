/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

/**
 * A production company which makes movies
 * 
 * @author colin
 *
 */
public class ProductionCompany {

	private String companyName;
	
	/**
	 * Gets the production company name
	 * 
	 * @return companyName
	 */
	public String getCompanyName(){
		return companyName;
	}
	
	/**
	 * Sets the company name
	 * 
	 * @param companyName
	 */
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}
}
