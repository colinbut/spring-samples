/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.CustomerPaymentDetail;


/**
 * @author colin
 *
 */
@Repository
public class CustomerPaymentDetailDaoImplTest implements CustomerPaymentDetailDao {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public CustomerPaymentDetail findById(int id) {
		String sql = "SELECT * FROM CustomerPaymentDetails WHERE customer_payment_details_id = ?";
		
		Connection con = null;
		CustomerPaymentDetail customerPaymentDetail = null;
		
		try {
			con = dataSource.getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				customerPaymentDetail = new CustomerPaymentDetail();
				customerPaymentDetail.setPaymentDetailsId(id);
				customerPaymentDetail.setCustomerReference(rs.getString("customer_reference"));
				customerPaymentDetail.setCardNo(rs.getString("customer_card_number"));
				customerPaymentDetail.setCardExpiryDate(rs.getString("customer_card_expiry_date"));
				customerPaymentDetail.setCustomer(customerDao.findById(rs.getInt("customer_id")));
			}
			
			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch(SQLException e) {}
				
			}
		}
		
		return customerPaymentDetail;
	}

	@Override
	public void insertCustomerPaymentDetail(
			CustomerPaymentDetail customerPaymentDetail) {
		String sql = "INSERT INTO CustomerPaymentDetails (customer_reference, customer_card_number, customer_card_expiry_date, customer_id) "
				+ "VALUES (?,?,?,?)";
		
		Connection con = null;
		
		try {
			con = dataSource.getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, customerPaymentDetail.getCustomerReference());
			stmt.setInt(4, customerPaymentDetail.getCustomer().getCustomerId());
			
			stmt.executeUpdate();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch(SQLException e) {}
				
			}
		}
	}

}
