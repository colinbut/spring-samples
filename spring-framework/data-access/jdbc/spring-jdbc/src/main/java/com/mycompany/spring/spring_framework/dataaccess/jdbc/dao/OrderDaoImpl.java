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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Item;
import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Order;

/**
 * @author colin
 *
 */
@Repository("orderDaoImpl")
public class OrderDaoImpl implements OrderDao {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	@Qualifier("customerDaoImpl")
	private CustomerDao customerDao;
	
	@Autowired
	@Qualifier("ordersItemsMappingDaoImpl")
	private OrdersItemsMappingDao ordersItemsMappingDao;
	
	@Autowired
	@Qualifier("itemDaoImpl")
	private ItemDao itemDao;
	
	@Override
	public Order findById(int id) {
		String sql = "SELECT * FROM Orders WHERE order_id = ?";
		
		Connection con = null;
		Order order = null;
		
		try {
			con = dataSource.getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				order = new Order();
				order.setOrderId(id);
				order.setCustomer(customerDao.findById(rs.getInt("customer_id")));
				
				List<Integer> itemIds = ordersItemsMappingDao.getItemsIdByOrderId(id);
				List<Item> items = new ArrayList<>();
				for(Integer itemId : itemIds) {
					items.add(itemDao.findById(itemId));
				}
				
				order.setItems(items);
				
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
		
		return order;
	}

	@Override
	public void insertOrder(Order order) {
		String sql = "INSERT INTO Orders (customer_id) "
				+ "VALUES (?)";
		
		Connection con = null;
		
		try {
			con = dataSource.getConnection();
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, order.getCustomer().getCustomerId());
			
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
