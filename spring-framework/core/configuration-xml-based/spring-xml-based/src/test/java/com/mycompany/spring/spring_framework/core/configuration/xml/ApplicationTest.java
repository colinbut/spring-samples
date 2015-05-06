/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.xml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author colin
 *
 */
public class ApplicationTest {

	/**
	 * Test loading of Beans from an XML config file
	 */
	@Test
	public void testLoadingBeansConfiguration() {
		
		// sets up the application context
		ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
		
		// get the bean from the ioc
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld", HelloWorld.class);
		//HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld");
		
		// use the bean
		assertEquals("HelloWorld", helloWorld.getHelloWorldMessage());
		
		// closes the application context
		((ConfigurableApplicationContext)context).close();
		
	}
}
