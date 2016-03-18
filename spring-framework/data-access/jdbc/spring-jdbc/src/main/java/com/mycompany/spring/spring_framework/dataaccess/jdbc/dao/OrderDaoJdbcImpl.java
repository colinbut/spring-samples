/**
 * 
 */
package com.mycompany.spring.spring_framework.dataaccess.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Customer;
import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Item;
import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Order;

/**
 * @author colin
 *
 */
@Repository("orderDaoJdbcImpl")
public class OrderDaoJdbcImpl implements OrderDao {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("customerDaoJdbcImpl")
	private CustomerDao customerDao;
	
	@Autowired
	@Qualifier("itemDaoJdbcImpl")
	private ItemDao itemDao;
	
	@PostConstruct
	public void init() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Order findById(int id) {
		
		String sql = "SELECT * FROM Orders WHERE order_id = ?";
		
		jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Order>() {

			@Override
			public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Order order = new Order();
				
				// get customer 
				Customer customer = customerDao.findById(rs.getInt("customer_id"));
				order.setCustomer(customer);
				
				// get list of items
				List<Integer> itemIds = jdbcTemplate.queryForList("SELECT item_id from orders_items WHERE order_id = ?", 
						new Object[]{id}, Integer.class);
				
				List<Item> items = new ArrayList<Item>();
				for(Integer itemId : itemIds) {
					items.add(itemDao.findById(itemId));
				}
				
				order.setItems(items);
				
				return order;
			}
		});
		
		return null;
	}

	@Override
	public void insertOrder(Order order) {
		String sql = "INSERT INTO Orders (customer_id) VALUES (?)";
		jdbcTemplate.update(sql, new Object[]{order.getCustomer().getCustomerId()});
	}

}
