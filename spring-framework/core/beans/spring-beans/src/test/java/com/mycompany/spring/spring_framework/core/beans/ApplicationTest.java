/**
 * 
 */
package com.mycompany.spring.spring_framework.core.beans;

import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring.spring_framework.core.beans.admin.AdminUser;
import com.mycompany.spring.spring_framework.core.beans.onlinestore.ShoppingCart;
import com.mycompany.spring.spring_framework.core.beans.onlinestore.model.Book;
import com.mycompany.spring.spring_framework.core.beans.onlinestore.model.CD;

/**
 * @author colin
 *
 */
public class ApplicationTest {

		
	// --------- Naming ----------------------------------
	 
	/**
	 * Tests the naming the beans (aliases etc...)
	 */
	@Test
	public void testBeansNaming(){
		ApplicationContext context = new ClassPathXmlApplicationContext("naming.xml");
		AdminUser foo = (AdminUser) context.getBean("adminUser");
		assertEquals("Admin", foo.getName());
		((ConfigurableApplicationContext)context).close();
	}
	
	// --------- Instantiation ----------------------------
	
	/**
	 * Test beans instantiation with a Constructor
	 */
	@Test
	public void testBeansInstantiatingWithAConstructor(){
		ApplicationContext context = new ClassPathXmlApplicationContext("instantiation.xml");
		Book book = context.getBean("book", Book.class);
		assertTrue(book instanceof Book);
		((ConfigurableApplicationContext)context).close();
	}
	
	/**
	 * Test instantiating beans using a static factory method
	 */
	@Test
	public void testBeansInstantiatingWithAStaticFactoryMethod(){
		ApplicationContext context = new ClassPathXmlApplicationContext("instantiation.xml");
		ShoppingCart shoppingCart = context.getBean("shoppingCart", ShoppingCart.class);
		assertTrue(shoppingCart instanceof ShoppingCart);
		((ConfigurableApplicationContext)context).close();
	}
	
	/**
	 * Test instantiating beans with an instance factory method
	 */
	@Test
	public void testBeansInstantiatingWithAInstanceFactoryMethod(){
		ApplicationContext context = new ClassPathXmlApplicationContext("instantiation.xml");
		CD cd = context.getBean("cd", CD.class);
		assertTrue(cd instanceof CD);
		((ConfigurableApplicationContext)context).close();
	}
}
