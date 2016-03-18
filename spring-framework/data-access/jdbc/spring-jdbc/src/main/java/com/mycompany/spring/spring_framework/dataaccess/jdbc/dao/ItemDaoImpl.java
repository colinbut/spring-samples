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

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Item;

/**
 * @author colin
 *
 */
@Repository("itemDaoImpl")
public class ItemDaoImpl implements ItemDao {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public Item findById(int id) {
		String sql = "SELECT * FROM ITEMS WHERE item_id = ?";
		
		Connection con = null;
		Item item = null;
		
		try {
			con = dataSource.getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				item = new Item();
				item.setItemId(id);
				item.setItemName(rs.getString("item_name"));
				item.setItemPrice(rs.getBigDecimal("item_price"));
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
		
		return item;
	}

	@Override
	public void insertItem(Item item) {
		String sql = "INSERT INTO ITEMS (item_name, item_price) "
				+ "VALUES (?,?)";
		
		Connection con = null;
		
		try {
			con = dataSource.getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, item.getItemName());
			stmt.setBigDecimal(2, item.getItemPrice());
			
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
