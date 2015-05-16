/**
 * 
 */
package com.mycompany.spring.spring_framework.core.autowiring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author colin
 *
 */
public class ApplicationTest {

	@Test
	public void testAutowiringGetBean(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		MovieRecommender movieRecommender = context.getBean("movieRecommender", MovieRecommender.class);
		
		Movie movie = movieRecommender.recommendMovie();
		
		assertEquals("Batman", movie.getTitle());
		assertEquals(1990, movie.getYear());
		assertTrue(movie instanceof Movie);
		
		System.out.println(movie.toString());
		
	}
}
