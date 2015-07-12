/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import java.util.List;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.OrdersItemsMapping;

/**
 * @author colin
 *
 */
public interface OrdersItemsMappingDao {

	OrdersItemsMapping findById(int id);
	
	int findOrderIdByItemId(int itemId);
	
	int findItemIdByOrderId(int orderId);
	
	List<Integer> getItemsIdByOrderId(int orderId);
	
	List<Integer> getOrdersIdByItemId(int itemId);
}
