/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring.spring_framework.core.configuration.annotations.model.SimpleMovieLister;

/**
 * @author colin
 *
 */
public class AnnotationsBasedTest {

	/**
	 * Test the instantiation of beans using an annotation based approach
	 */
	@Test
	public void testAnnotationsBasedConfiguration(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
		
		assertTrue(simpleMovieLister instanceof SimpleMovieLister);
		
		((ConfigurableApplicationContext)context).close();
		
	}
}
