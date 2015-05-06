/**
 * 
 */
package com.mycompany.spring.spring_framework.core.beans.onlinestore;

/**
 * A shopping cart that holds items
 * 
 * @author colin
 *
 */
public class ShoppingCart {

	private static ShoppingCart shoppingCart = new ShoppingCart();
	
	private ShoppingCart(){}
	
	/**
	 * Creates the shopping cart instance
	 * 
	 * @return
	 */
	public static ShoppingCart createInstance(){
		return shoppingCart;
	}
}
