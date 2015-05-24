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

	/**
	 * Withdraw money
	 * 
	 * @return
	 */
	Money withdraw();
	
	/**
	 * Deposit money
	 * 
	 * @param money
	 */
	void deposit(Money money);
	
	/**
	 * Gets the balance
	 */
	void getBalance();
	
}
