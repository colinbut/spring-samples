/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Customer;

/**
 * @author colin
 *
 */
@Component
public class AppTest {

	@Autowired
	@Qualifier("customerDaoImpl")
	private CustomerDao customerDao;
	
	public void test() {
		Customer customer = customerDao.findById(1);
		System.out.println(customer);
		
	}

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		AppTest appTest = context.getBean(AppTest.class);
		appTest.test();
		((ConfigurableApplicationContext)context).close();
	}
}
