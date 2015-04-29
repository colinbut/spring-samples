/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.spring.spring_framework.core.configuration.annotations.dao.CustomerPreferenceDao;

/**
 * @author colin
 *
 */
public class MovieRecommender {

	private MovieCatalog movieCatalog;
	
	private CustomerPreferenceDao customerPreferenceDao;
	
	@Autowired
	public void prepare(MovieCatalog movieCatalog, 
			CustomerPreferenceDao customerPreferenceDao) {
		this.movieCatalog = movieCatalog;
		this.customerPreferenceDao = customerPreferenceDao;
	}
}
