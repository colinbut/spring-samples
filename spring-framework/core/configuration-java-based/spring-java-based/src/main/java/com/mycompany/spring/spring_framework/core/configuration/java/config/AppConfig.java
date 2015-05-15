/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.java.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.mycompany.spring.spring_framework.core.configuration.java.dao.AccountRepository;
import com.mycompany.spring.spring_framework.core.configuration.java.model.Money;
import com.mycompany.spring.spring_framework.core.configuration.java.service.AccountService;
import com.mycompany.spring.spring_framework.core.configuration.java.service.AccountServiceImpl;
import com.mycompany.spring.spring_framework.core.configuration.java.service.MyService;
import com.mycompany.spring.spring_framework.core.configuration.java.service.MyServiceImpl;

/**
 * AppConfig - a configuration class part of Java Config based of Spring Framework
 * where it contains the bean definitions...
 * 
 * 
 * @author colin
 *
 */
@Configuration
@Import(AppConfigComponentScan.class)
public class AppConfig {

	
	@Bean(initMethod="init", destroyMethod = "cleanup")
	@Qualifier("myService1")
	public MyService myService(AccountRepository accountRepository){
		return new MyServiceImpl(accountRepository);
	}
	
	/**
	 * Equivalent to above bean definition but this calls explicitly the
	 * init method to initialise the class rather than specifying it in the initMethod
	 * 
	 * @param accountRepository
	 * @return
	 */
	@Bean
	public MyService myServiceVersion2(AccountRepository accountRepository){
		MyServiceImpl myService = new MyServiceImpl(accountRepository);
		myService.init(); //equivalent to above bean definition
		return myService;
	}
	
	/**
	 * Setting Bean Scope in Java-Based config 
	 * 
	 * @return
	 */
	@Bean
	@Scope("prototype")
	//@Scope(BeanDefintiion.)
	public Money money(){
		return new Money();
	}
	
	/**
	 * Customizing bean naming
	 * 
	 * naming it accountDao rather than accountRepository
	 * 
	 * @return
	 */
	@Bean(name="accountDao")
	public AccountRepository accountRepository(){
		return new AccountRepository();
	}
	
	/**
	 * Bean description
	 * 
	 * @return
	 */
	@Bean
	@Description("Provides basic account service to customers")
	public AccountService accountService(){
		return new AccountServiceImpl();
	}
	
	/**
	 * Inter-bean dependencies
	 * 
	 * calls accountRepository() method for Constructor DI
	 * 
	 * @return
	 */
	@Bean
	public MyService myServiceVersion3(){
		MyServiceImpl myService = new MyServiceImpl(accountRepository());
		return myService;
	}
	
}
