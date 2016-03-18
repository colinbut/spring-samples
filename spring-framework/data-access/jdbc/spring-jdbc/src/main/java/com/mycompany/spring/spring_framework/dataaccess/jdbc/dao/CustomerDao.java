/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import java.util.List;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Customer;

/**
 * @author colin
 *
 */
public interface CustomerDao {

	Customer findById(int id);
	
	String findCustomerLastNameById(int id);
	
	List<Customer> findAll();
	
	void insertCustomer(Customer customer);
	
	void insertBatch1(List<Customer> customers);
	
	void insertBatch2(String sql);
}
