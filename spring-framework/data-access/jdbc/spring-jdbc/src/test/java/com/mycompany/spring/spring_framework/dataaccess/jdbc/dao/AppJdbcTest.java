/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.dao.CustomerDao;
import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Address;
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
	
	public void testBatchUpdate() {
		
		List<Customer> customers = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			Customer customer = new Customer();
			customer.setFirstName("Firstname" + i);
			customer.setLastName("Lastname" + i);
			customer.setDateOfBirth(new Date());
			customer.setEmail("custom" + i + "email@email.com");
			// TODO: fix address
			Address address = new Address();
			address.setAddressId(1); // hardcode to use first existing address in db
			customer.setAddress(address);
			customers.add(customer);
		}
		
		// batch inserts
		customerJdbcDao.insertBatch1(customers);
		
		// batch update one column
		String sql = "UPDATE CUSTOMER SET customer_lastname = 'Ma'";
		customerJdbcDao.insertBatch2(sql);
		
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		AppJdbcTest appJdbcTest = context.getBean(AppJdbcTest.class);
		
		appJdbcTest.testFindOneRow();
		appJdbcTest.testFindOneColumn();
		//appJdbcTest.testFindAll();
		appJdbcTest.testBatchUpdate();
		appJdbcTest.testFindAll();
		
		
		((ConfigurableApplicationContext)context).close();
	}
}
