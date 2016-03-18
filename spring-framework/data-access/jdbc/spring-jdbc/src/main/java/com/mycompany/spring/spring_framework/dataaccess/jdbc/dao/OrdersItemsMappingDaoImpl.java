/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.OrdersItemsMapping;

/**
 * @author colin
 *
 */
@Repository("ordersItemsMappingDaoImpl")
public class OrdersItemsMappingDaoImpl implements OrdersItemsMappingDao {

	@Autowired
	private DataSource dataSource;
	
	@Override
	public OrdersItemsMapping findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findOrderIdByItemId(int itemId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int findItemIdByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Integer> getItemsIdByOrderId(int orderId) {
		String sql = "SELECT item_id FROM OrdersItems WHERE order_id = ?";
		
		List<Integer> itemIds = new ArrayList<Integer>();
		Connection con = null;
		
		try {
			con = dataSource.getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1,orderId);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				itemIds.add(rs.getInt("item_id"));
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
		
		return itemIds;
	}

	@Override
	public List<Integer> getOrdersIdByItemId(int itemId) {
		// TODO Auto-generated method stub
		return null;
	}

}
