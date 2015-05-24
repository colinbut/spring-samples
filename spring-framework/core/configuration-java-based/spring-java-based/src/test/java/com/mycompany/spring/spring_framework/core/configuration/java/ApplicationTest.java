/**
 * 
 */
package com.mycompany.spring.spring_framework.core.configuration.java;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mycompany.spring.spring_framework.core.configuration.java.config.AppConfig;
import com.mycompany.spring.spring_framework.core.configuration.java.config.AppConfigComponentScan;
import com.mycompany.spring.spring_framework.core.configuration.java.service.MyService;
import com.mycompany.spring.spring_framework.core.configuration.java.service.MyServiceImpl;
import com.mycompany.spring.spring_framework.core.configuration.java.service.TransferService;

/**
 * @author colin
 *
 */
public class ApplicationTest {
	
	/**
	 * Test getting bean in AppConfig
	 */
	@Test
	public void testGetBeanInAppConfigJavaFile(){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MyService myService = context.getBean(MyService.class);
		assertTrue(myService instanceof MyService);
		((ConfigurableApplicationContext)context).close();
	}
	
	/**
	 * Similar test to above but uses classes annotated with @Component, JSR-330 annotations etc
	 * in constructor of AnnotationConfigApplicationContext
	 */
	@Test
	public void testGetBeanInAppConfigJavaFile2(){
		ApplicationContext context = new AnnotationConfigApplicationContext(MyServiceImpl.class);
		MyService myService = context.getBean(MyService.class);
		assertTrue(myService instanceof MyService);
		((ConfigurableApplicationContext)context).close();
	}
	
	/**
	 * Test the construction of the AnnotationConfigContext programmatically
	 */
	@Test
	public void testBuildingAnnotationConfigApplicationContextProgrammatically(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		MyService myService = context.getBean(MyService.class);
		assertTrue(myService instanceof MyService);
		((ConfigurableApplicationContext)context).close();
	}
	
	/**
	 * Test component scan within Config based configuration
	 */
	@Test
	public void testAppConfigComponentScanUsingAnnotationApplicationContext(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.mycompany");
		context.refresh();
		MyService myService = context.getBean(MyService.class);
		assertTrue(myService instanceof MyService);
		
		myService.doStuff();
		
		((ConfigurableApplicationContext)context).close();
	}
	
	/**
	 * Test component scan using AppConfig (same as above but above one does it
	 * programmatically)
	 */
	@Test
	public void testAppConfigComponentScanUsingAppConfigJavaClass(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigComponentScan.class);
		
		TransferService transferService = context.getBean(TransferService.class);
		
		// this passes because TransferServiceImpl is annotated with '@Component'
		assertTrue(transferService instanceof TransferService);
		
		((ConfigurableApplicationContext)context).close();
	}
	
	/**
	 * Test the importing of other AppConfigs into this AppConfig
	 */
	@Test
	public void testImportingOfAppConfigs(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigComponentScan.class);
		
		MyService myService = context.getBean("myService1", MyService.class);// get by Qualifier
		TransferService transferService = context.getBean(TransferService.class);
		
		assertTrue(myService instanceof MyService);
		assertTrue(transferService instanceof TransferService);
		
		((ConfigurableApplicationContext)context).close();
	}
	
}
