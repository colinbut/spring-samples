/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Customer;

/**
 * @author colin
 *
 */
@Repository("customerDaoJdbcImpl")
public class CustomerDaoJdbcImpl implements CustomerDao {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("addressDaoJdbcImpl")
	private AddressDao addressDao;
	
	@PostConstruct
	public void init() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Customer findById(int id) {
		
		String sql = "SELECT * FROM CUSTOMER WHERE customer_id = ?";
		
		Customer customer = jdbcTemplate.queryForObject(sql, new Object[]{id}, 
				new CustomerRowMapper());
		
//		Customer customer = jdbcTemplate.queryForObject(sql, new Object[]{id}, 
//				new BeanPropertyRowMapper<Customer>(Customer.class));
		
		return customer;
	}

	@Override
	public void insertCustomer(Customer customer) {
		
		String sql = "INSERT INTO CUSTOMER (customer_firstname, customer_lastname, customer_date_of_birth, customer_email_address, customer_address_id) "
				+ "VALUES (?,?,?,?,?)";
		
		jdbcTemplate.update(sql, new Object[] {
				customer.getFirstName(),
				customer.getLastName(),
				customer.getDateOfBirth(),
				customer.getEmail(),
				customer.getAddress().getAddressId()
		});
		
	}
	
	private class CustomerRowMapper implements RowMapper<Customer> {

		@Override
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Customer customer = new Customer();
			customer.setCustomerId(rs.getInt("customer_id"));
			customer.setFirstName(rs.getString("customer_firstname"));
			customer.setLastName(rs.getString("customer_lastname"));
			customer.setDateOfBirth(rs.getDate("customer_date_of_birth"));
			customer.setEmail(rs.getString("customer_email_address"));
			customer.setAddress(addressDao.findById(rs.getInt("customer_address_id")));
			
			return customer;
		}
		
	}

	@Override
	public List<Customer> findAll() {
		String sql = "SELECT * FROM CUSTOMER;";
		
		List<Customer> customers = new ArrayList<>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for(Map<String, Object> row : rows) {
			Customer customer = new Customer();
			customer.setCustomerId(Integer.parseInt(String.valueOf(row.get("customer_id"))));
			customer.setFirstName(String.valueOf(row.get("customer_firstname")));
			customer.setLastName(String.valueOf(row.get("customer_lastname")));
			customer.setEmail(String.valueOf(row.get("customer_email_address")));
			customers.add(customer);
		}
		
		return customers;
	}

	@Override
	public String findCustomerLastNameById(int id) {
		
		String sql = "SELECT customer_lastname FROM CUSTOMER WHERE customer_id = ?";
		
		String customerLastName = null;
		
		customerLastName = jdbcTemplate.queryForObject(sql, new Object[]{id}, String.class);
		
		return customerLastName;
	}

	@Override
	public void insertBatch1(List<Customer> customers) {
		
		String sql = "INSERT INTO CUSTOMER (customer_firstname, customer_lastname, customer_date_of_birth, customer_email_address, customer_address_id) "
				+ "VALUES (?,?,?,?,?)";
		
		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Customer customer = customers.get(i);
				ps.setString(1, customer.getFirstName());
				ps.setString(2, customer.getLastName());
				ps.setDate(3, new java.sql.Date(customer.getDateOfBirth().getTime()));
				ps.setString(4, customer.getEmail());
				ps.setInt(5, customer.getAddress().getAddressId());
			}
			
			@Override
			public int getBatchSize() {
				return customers.size();
			}
		});
		
	}

	@Override
	public void insertBatch2(String sql) {
		jdbcTemplate.batchUpdate(sql);
	}

}
