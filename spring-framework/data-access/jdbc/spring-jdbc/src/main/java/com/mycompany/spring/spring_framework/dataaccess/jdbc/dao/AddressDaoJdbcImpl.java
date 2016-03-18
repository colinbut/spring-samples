/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Address;

/**
 * @author colin
 *
 */
@Repository("addressDaoJdbcImpl")
public class AddressDaoJdbcImpl implements AddressDao {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void init() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Address findById(int id) {
		String sql = "SELECT * FROM ADDRESS WHERE address_id = ?";
		
		jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Address>() {

			@Override
			public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Address address = new Address();
				address.setAddressId(id);
				address.setHouseFlatNo(rs.getInt("house_flat_no"));
				address.setStreet(rs.getString("street"));
				address.setPostCode(rs.getString("postcode"));
				address.setCity(rs.getString("city"));
				address.setCountry(rs.getString("country"));
				
				return address;
			}
		});
		
		return null;
	}

	@Override
	public void insertAddress(Address address) {
		String sql = "INSERT INTO ADDRESS (house_flat_no, street, postcode, city, country) "
				+ "VALUES (?,?,?,?,?)";
		
		jdbcTemplate.update(sql, new Object[]{
				address.getHouseFlatNo(),
				address.getStreet(),
				address.getPostCode(),
				address.getCity(),
				address.getCountry()
		});
	}
}
