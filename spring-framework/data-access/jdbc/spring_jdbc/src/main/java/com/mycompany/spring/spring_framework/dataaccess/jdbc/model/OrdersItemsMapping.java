/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.model;

/**
 * @author colin
 *
 */
public class OrdersItemsMapping {

	private int orderId;
	private int itemId;
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getItemId() {
		return itemId;
	}
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
}
