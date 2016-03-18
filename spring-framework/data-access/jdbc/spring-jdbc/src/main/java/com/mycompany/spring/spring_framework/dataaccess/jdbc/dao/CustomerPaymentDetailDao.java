/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.CustomerPaymentDetail;

/**
 * @author colin
 *
 */
public interface CustomerPaymentDetailDao {

	CustomerPaymentDetail findById(int id);
	
	void insertCustomerPaymentDetail(CustomerPaymentDetail customerPaymentDetail);
}
