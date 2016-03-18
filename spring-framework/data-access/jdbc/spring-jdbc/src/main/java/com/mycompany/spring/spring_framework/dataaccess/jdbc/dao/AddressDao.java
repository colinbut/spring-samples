/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Address;

/**
 * @author colin
 *
 */
public interface AddressDao {

	Address findById(int id);
	
	void insertAddress(Address address);
}
