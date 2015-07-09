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

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Address;

/**
 * @author colin
 *
 */
@Repository
public class AddressDaoImplTest implements AddressDao {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public Address findById(int id) {
		String sql = "SELECT * FROM ADDRESS WHERE address_id = ?";
		
		Connection con = null;
		Address address = null;
		
		try {
			con = dataSource.getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				address = new Address();
				address.setAddressId(id);
				address.setHouseFlatNo(rs.getInt("house_flat_no"));
				address.setStreet(rs.getString("street"));
				address.setPostCode(rs.getString("postcode"));
				address.setCity(rs.getString("city"));
				address.setCountry(rs.getString("country"));
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
		
		return address;
	}

	@Override
	public void insertAddress(Address address) {
		String sql = "INSERT INTO ADDRESS (house_flat_no, street, postcode, city, country) "
				+ "VALUES (?,?,?,?,?)";
		
		Connection con = null;
		
		try {
			con = dataSource.getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, address.getHouseFlatNo());
			stmt.setString(2, address.getStreet());
			stmt.setString(3, address.getPostCode());
			stmt.setString(4, address.getCity());
			stmt.setString(5, address.getCountry());
			
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
