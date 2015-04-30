/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.spring.spring_framework.core.configuration.annotations.annotations.Genre;
import com.mycompany.spring.spring_framework.core.configuration.annotations.annotations.Offline;
import com.mycompany.spring.spring_framework.core.configuration.annotations.dao.CustomerPreferenceDao;

/**
 * @author colin
 *
 */
public class MovieRecommender {

	@Autowired
	@Genre("Comedy")
	private MovieCatalog comedyCatalog;
	
	private MovieCatalog actionCatalog;
	
	@Autowired
	@Offline
	private MovieCatalog offlineCatalog;
	
	private CustomerPreferenceDao customerPreferenceDao;
	
	@Autowired
	public void prepare(@Genre("Action") MovieCatalog actionCatalog, 
			CustomerPreferenceDao customerPreferenceDao) {
		this.actionCatalog = actionCatalog;
		this.customerPreferenceDao = customerPreferenceDao;
	}
	
	public MovieCatalog getActionCatalog(){
		return actionCatalog;
	}
	
	public CustomerPreferenceDao getCustomerPreferenceDao(){
		return customerPreferenceDao;
	}
}
