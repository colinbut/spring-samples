/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.model;

/**
 * @author colin
 *
 */
public class CustomerPaymentDetail {

	private int paymentDetailsId;
	private String customerReference;
	private String cardNo;
	private String cardExpiryDate;
	private Customer customer;
	
	public int getPaymentDetailsId() {
		return paymentDetailsId;
	}
	
	public void setPaymentDetailsId(int paymentDetailsId) {
		this.paymentDetailsId = paymentDetailsId;
	}
	
	public String getCustomerReference() {
		return customerReference;
	}
	
	public void setCustomerReference(String customerReference) {
		this.customerReference = customerReference;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getCardExpiryDate() {
		return cardExpiryDate;
	}
	
	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		return "CustomerPaymentDetails [paymentDetailsId=" + paymentDetailsId
				+ ", customerReference=" + customerReference + ", cardNo="
				+ cardNo + ", cardExpiryDate=" + cardExpiryDate + ", customer="
				+ customer + "]";
	}
	
	
}
