/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies.model;

/**
 * @author colin
 *
 */
public class Producer {

	// the Production Company this Producer works for/belongs to
	private ProductionCompany productionCompany;
	
	/**
	 * Gets the production company
	 * 
	 * @return
	 */
	public ProductionCompany getProductionCompany(){
		return productionCompany;
	}
	
	/**
	 * Sets the production company
	 * 
	 * @param productionCompany
	 */
	public void setProductionCompany(ProductionCompany productionCompany){
		this.productionCompany = productionCompany;
	}
}
