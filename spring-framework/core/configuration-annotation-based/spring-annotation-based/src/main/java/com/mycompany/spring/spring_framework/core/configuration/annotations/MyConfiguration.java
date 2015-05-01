/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author colin
 *
 */
@Configuration
public class MyConfiguration {

	@Bean
	public StringStore stringStore(){
		return new StringStore();
	}
	
	@Bean
	public IntegerStore integerStore() {
		return new IntegerStore();
	}
	
	
	@Autowired
	private List<Store<Integer>> integerStoresList;
	
}
