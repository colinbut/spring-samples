/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
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
public class AppJdbcTest {
	
	@Autowired
	private CustomerDaoJdbc customerJdbcDao;
	
	public void test() {
		Customer customer = customerJdbcDao.findById(1);
		System.out.println(customer);
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		AppJdbcTest appJdbcTest = context.getBean(AppJdbcTest.class);
		appJdbcTest.test();
		((ConfigurableApplicationContext)context).close();
	}
}
