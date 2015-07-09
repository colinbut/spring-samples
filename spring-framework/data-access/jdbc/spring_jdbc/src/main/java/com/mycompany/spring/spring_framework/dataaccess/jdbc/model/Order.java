/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.model;

import java.util.List;

/**
 * @author colin
 *
 */
public class Order {

	private int orderId;
	private Customer customer;
	private List<Item> items;
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer
				+ ", items=" + items + "]";
	}
	
}
