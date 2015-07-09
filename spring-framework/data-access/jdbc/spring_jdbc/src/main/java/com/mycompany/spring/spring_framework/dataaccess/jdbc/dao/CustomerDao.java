/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Customer;

/**
 * @author colin
 *
 */
public interface CustomerDao {

	Customer findById(int id);
	
	void insertCustomer(Customer customer);
}
