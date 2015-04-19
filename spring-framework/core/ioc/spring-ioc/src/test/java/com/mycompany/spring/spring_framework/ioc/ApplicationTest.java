/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc;

import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.spring.spring_framework.ioc.model.Lecturer;
import com.mycompany.spring.spring_framework.ioc.model.Student;
import com.mycompany.spring.spring_framework.ioc.service.*;

/**
 * @author colin
 *
 */
public class ApplicationTest {

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
	
	@Test
	public void testLoadingOneBeansConfigurationFile(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("model.xml");
		
		Student student = (Student)context.getBean("student", Student.class);
		
		assertEquals("Student Name", student.getName());
		
		((ConfigurableApplicationContext)context).close();
		
	}
	
	@Test
	public void testLoadingMultipleBeansConfigurationFiles(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
												new String[] {"beans.xml", "model.xml", "daos.xml"});
		
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloworld", HelloWorld.class);
		Student student = (Student)context.getBean("student", Student.class);
		Lecturer lecturer = (Lecturer)context.getBean("lecturer", Lecturer.class);
		
		assertEquals("Student Name", student.getName());
		
		
	}
	
	@Test
	public void testLoadingApplicationContextConfiguration(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/application-context.xml");
		
		ClassService classServiceImpl = (ClassServiceImpl)context.getBean("classServiceImpl");
		LecturerService lecturerServiceImpl = (LecturerServiceImpl)context.getBean("lecturerServiceImpl");
		StudentService studentServiceImpl = (StudentServiceImpl)context.getBean("studentServiceImpl");
		
		assertEquals("Class", classServiceImpl.getClassDetails().getName());
		assertEquals("Lecturer Name", lecturerServiceImpl.getLecturer().getName());
		assertEquals("Student Name", studentServiceImpl.getStudent().getName());
		
		((ConfigurableApplicationContext)context).close();
		
	}

}
