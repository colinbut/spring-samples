/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.dao.AddressDao;
import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Customer;

/**
 * @author colin
 *
 */
@Repository
public class CustomerDaoJdbcImplTest implements CustomerDaoJdbc {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void init() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Customer findById(int id) {
		
		String sql = "SELECT * FROM CUSTOMER WHERE customer_id = ?";
		
//		Customer customer = jdbcTemplate.queryForObject(sql, new Object[]{id}, 
//				new CustomerRowMapper());
		
		Customer customer = jdbcTemplate.queryForObject(sql, new Object[]{id}, 
				new BeanPropertyRowMapper<Customer>());
		
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

		@Autowired
		private AddressDao addressDao;
		
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

}
