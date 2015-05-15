/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.java.service;

import com.mycompany.spring.spring_framework.core.configuration.java.model.Money;

/**
 * @author colin
 *
 */
public interface AccountService {

	Money withdraw();
	
	void deposit(Money money);
	
	void getBalance();
	
}
