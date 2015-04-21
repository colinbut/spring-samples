/**
 * 
 */
package com.mycompany.spring.spring_framework.core.beans;

/**
 * @author colin
 *
 */
public class ShoppingCart {

	private static ShoppingCart shoppingCart = new ShoppingCart();
	
	private ShoppingCart(){}
	
	public static ShoppingCart createInstance(){
		return shoppingCart;
	}
}
