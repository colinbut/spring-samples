/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.java.service;

import com.mycompany.spring.spring_framework.core.configuration.java.dao.AccountRepository;

/**
 * @author colin
 *
 */
public class MyServiceImpl implements MyService {

	private AccountRepository accountRepository;
	
	/**
	 * Constructor
	 * 
	 * uses DI
	 * 
	 * @param accountRepository
	 */
	public MyServiceImpl(AccountRepository accountRepository){
		this.accountRepository = accountRepository;
	}
	
	/**
	 * Initialisation
	 */
	public void init(){
		System.out.println("Initiating");
	}
	
	/**
	 * Destruction
	 */
	public void cleanup(){
		System.out.println("Cleaning up resources");
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.core.configuration.java.service.MyService#doStuff()
	 */
	public void doStuff() {
		System.out.println("I'm doing some stuff");
	}

}
