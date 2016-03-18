/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Item;

/**
 * @author colin
 *
 */
public interface ItemDao {

	Item findById(int id);
	
	void insertItem(Item item);
}
