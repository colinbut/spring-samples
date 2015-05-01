/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author colin
 *
 */
public class Storage {

	@Autowired
	private Store<String> stringStore;
	
	@Autowired
	private Store<Integer> integerStore;
	
	@Autowired
	private List<Store<Integer>> integerStoresList;
	
	
}
