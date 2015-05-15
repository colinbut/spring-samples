/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.java.model;

import java.math.BigDecimal;

/**
 * @author colin
 *
 */
public class Money {

	private BigDecimal amount;
	private Currency currency;
	
	
	
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	/**
	 * @return the currency
	 */
	public Currency getCurrency() {
		return currency;
	}
	
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
}
