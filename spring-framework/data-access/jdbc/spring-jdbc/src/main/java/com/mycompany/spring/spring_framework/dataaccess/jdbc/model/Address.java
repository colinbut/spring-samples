/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.model;

/**
 * @author colin
 *
 */
public class Address {

	private int addressId;
	private int houseFlatNo;
	private String street;
	private String postCode;
	private String city;
	private String country;
	
	public int getAddressId() {
		return addressId;
	}
	
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	public int getHouseFlatNo() {
		return houseFlatNo;
	}
	
	public void setHouseFlatNo(int houseFlatNo) {
		this.houseFlatNo = houseFlatNo;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseFlatNo="
				+ houseFlatNo + ", street=" + street + ", postCode=" + postCode
				+ ", city=" + city + ", country=" + country + "]";
	}
	
	
}
