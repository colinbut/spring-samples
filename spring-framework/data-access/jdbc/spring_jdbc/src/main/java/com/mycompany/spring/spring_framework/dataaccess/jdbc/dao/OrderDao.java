/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Order;

/**
 * @author colin
 *
 */
public interface OrderDao {

	Order findById(int id);
	
	void insertOrder(Order order);
}
