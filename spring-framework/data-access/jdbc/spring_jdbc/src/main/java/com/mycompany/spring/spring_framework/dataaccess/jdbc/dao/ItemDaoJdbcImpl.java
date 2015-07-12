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

import com.mycompany.spring.spring_framework.dataaccess.jdbc.model.Item;

/**
 * @author colin
 *
 */
@Repository("itemDaoJdbcImpl")
public class ItemDaoJdbcImpl implements ItemDao {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	
	@PostConstruct
	public void init() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Item findById(int id) {
		String sql = "SELECT * FROM items where item_id = ?";
		
		Item item = jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Item item = new Item();
				item.setItemId(id);
				item.setItemName(rs.getString("item_name"));
				item.setItemPrice(rs.getBigDecimal("item_price"));
				
				return item;
			}
		});
		
		return item;
	}

	@Override
	public void insertItem(Item item) {
		
		String sql = "insert into items (item_name, item_price) values (?,?);";
		
		jdbcTemplate.update(sql, new Object[]{
				item.getItemName(),
				item.getItemPrice()
		});
		
	}

}
