/**
 * 
 */
package com.mycompany.spring.spring_framework.core.beans;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring.spring_framework.core.beans.foobar.Foo;
import com.mycompany.spring.spring_framework.core.beans.onlinestore.ShoppingCart;
import com.mycompany.spring.spring_framework.core.beans.onlinestore.model.Book;
import com.mycompany.spring.spring_framework.core.beans.onlinestore.model.CD;

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
	
	@After
	public void tearDown(){
		((ConfigurableApplicationContext)context).close();
	}
	
	// --------- Naming ----------------------------------
	 
	/**
	 * 
	 */
	@Test
	public void testBeansNaming(){
		Foo foo = (Foo) context.getBean("foobar");
		assertEquals("Foo", foo.getName());
	}
	
	// --------- Instantiation ----------------------------
	
	/**
	 * Test beans instantiation with a Constructor
	 */
	@Test
	public void testBeansInstantiatingWithAConstructor(){
		Book book = context.getBean("book", Book.class);
		assertTrue(book instanceof Book);
	}
	
	/**
	 * Test instantiating beans using a static factory method
	 */
	@Test
	public void testBeansInstantiatingWithAStaticFactoryMethod(){
		ShoppingCart shoppingCart = context.getBean("shoppingCart", ShoppingCart.class);
		assertTrue(shoppingCart instanceof ShoppingCart);
	}
	
	/**
	 * Test instantiating beans with an instance factory method
	 */
	@Test
	public void testBeansInstantiatingWithAInstanceFactoryMethod(){
		CD cd = context.getBean("cd", CD.class);
		assertTrue(cd instanceof CD);
	}
}
