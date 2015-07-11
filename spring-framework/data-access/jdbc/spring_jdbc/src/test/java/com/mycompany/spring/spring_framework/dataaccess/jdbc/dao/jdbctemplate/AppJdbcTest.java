/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.dao.CustomerDao;
import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Customer;

/**
 * @author colin
 *
 */
@Component
public class AppJdbcTest {
	
	@Autowired
	@Qualifier("customerDaoJdbcImpl")
	private CustomerDao customerJdbcDao;
	
	public void testFindOneRow() {
		Customer customer = customerJdbcDao.findById(1);
		System.out.println(customer);
	}
	
	public void testFindAll() {
		List<Customer> customers = customerJdbcDao.findAll();
		for(Customer customer : customers) {
			System.out.println(customer);
		}
	}
	
	public void testFindOneColumn() {
		System.out.println(customerJdbcDao.findCustomerLastNameById(1));
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		AppJdbcTest appJdbcTest = context.getBean(AppJdbcTest.class);
		
		appJdbcTest.testFindOneRow();
		appJdbcTest.testFindOneColumn();
		appJdbcTest.testFindAll();
		
		((ConfigurableApplicationContext)context).close();
	}
}
