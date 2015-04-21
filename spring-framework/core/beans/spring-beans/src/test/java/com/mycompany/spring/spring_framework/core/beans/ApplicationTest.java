/**
 * 
 */
package com.mycompany.spring.spring_framework.core.beans;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring.spring_framework.core.beans.Foo;



/**
 * @author colin
 *
 */
public class ApplicationTest {

	ApplicationContext context;
	
	@Before
	public void setUp(){
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@Test
	public void testBeansNaming(){
		
		Foo foo = (Foo) context.getBean("foobar");
		
		assertEquals("Foo", foo.getName());
		
		((ConfigurableApplicationContext)context).close();
	}
	
	@Test
	public void testBeansInstantiatingWithAConstructor(){
		
		Book book = context.getBean("book", Book.class);
		
		
	}
	
	@Test
	public void testBeansInstantiatingWithAStaticFactoryMethod(){
			
	}
	
	@Test
	public void testBeansInstantiatingWithAInstanceFactoryMethod(){
		
	}
}
