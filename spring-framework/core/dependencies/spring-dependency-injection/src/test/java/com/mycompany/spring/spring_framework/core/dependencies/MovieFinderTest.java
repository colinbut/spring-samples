/**
 * 
 */
package com.mycompany.spring.spring_framework.core.dependencies;

import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author colin
 *
 */
public class MovieFinderTest {

	/**
	 * Test getting movieFinder bean
	 */
	@Test
	public void testMovieFinderSetup(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MovieFinder movieFinder = context.getBean("movieFinder", MovieFinder.class);
		
		assertNotNull(movieFinder);
		
		((ConfigurableApplicationContext)context).close();
		
	}
}
