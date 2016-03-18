package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Customer;
import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.CustomerPaymentDetail;

/**
 * 
 * @author colin
 *
 */
@Repository("customerPaymentDetailDaoJdbcImpl")
public class CustomerPaymentDetailDaoJdbcImpl implements CustomerPaymentDetailDao {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("customerDaoJdbcImpl")
	private CustomerDao customerDao;
	
	@PostConstruct
	public void init() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public CustomerPaymentDetail findById(int id) {
		
		String sql = "SELECT * FROM CustomerPaymentDetails WHERE customer_payment_details_id = ?";
		
		CustomerPaymentDetail cpd = jdbcTemplate.queryForObject(sql, new Object[]{id},
				new RowMapper<CustomerPaymentDetail>() {

					@Override
					public CustomerPaymentDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						CustomerPaymentDetail cpd = new CustomerPaymentDetail();
						cpd.setCustomerReference(rs.getString("customer_reference"));
						cpd.setCardNo(rs.getString("customer_card_number"));
						cpd.setCardExpiryDate("customer_card_expiry_date");
						
						Customer customer = customerDao.findById(rs.getInt("customer_id"));
						
						cpd.setCustomer(customer);
						
						return null;
					}
				});
		
		return cpd;
	}

	@Override
	public void insertCustomerPaymentDetail(CustomerPaymentDetail customerPaymentDetail) {
		
		String sql = "INSERT INTO CustomerPaymentDetails (customer_reference, customer_card_number, customer_card_expiry_date, customer_id) "
				+ "VALUES (?,?,?,?)";
		
		jdbcTemplate.update(sql, new Object[]{
				customerPaymentDetail.getCustomerReference(),
				customerPaymentDetail.getCardNo(),
				customerPaymentDetail.getCardExpiryDate(),
				customerPaymentDetail.getCustomer().getCustomerId()
		});
		
	}

}
