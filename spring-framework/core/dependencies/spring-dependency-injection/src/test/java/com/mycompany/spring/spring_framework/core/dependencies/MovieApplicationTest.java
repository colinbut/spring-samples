/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author colin
 *
 */
public class MovieApplicationTest {

	/**
	 * Test the beans setup of dependency injection
	 * Ensuring that it is working...
	 */
	@Test
	public void testBeansSetup(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		int numberOfBeans = context.getBeanDefinitionCount();
		String[] beanNames = context.getBeanDefinitionNames();
		
		System.out.println("Number of beans created: " + numberOfBeans);
		for(String beanName : beanNames) {
			System.out.println(beanName);
		}
		
		System.out.println(context.getId());
		System.out.println(context.getApplicationName());
		System.out.println(context.getEnvironment().toString());
		System.out.println(context.getDisplayName());
		
		
		((ConfigurableApplicationContext)context).close();
		
	}
}
