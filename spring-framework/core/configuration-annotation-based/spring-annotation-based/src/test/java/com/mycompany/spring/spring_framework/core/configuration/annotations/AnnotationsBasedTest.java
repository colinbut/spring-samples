/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.annotations;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring.spring_framework.core.configuration.annotations.model.SimpleMovieLister;

/**
 * @author colin
 *
 */
public class AnnotationsBasedTest {

	@Test
	public void testAnnotationsBasedConfiguration(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister", SimpleMovieLister.class);
		
		
		
	}
}
