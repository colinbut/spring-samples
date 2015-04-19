/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.dao;

import java.sql.SQLException;

import com.mycompany.spring.spring_framework.ioc.model.Class;

/**
 * Data Access Object for Class
 * @author colin
 *
 */
public interface ClassDao {

	/**
	 * Gets the Class data from the database
	 * 
	 * @return
	 * @throws SQLException
	 */
	Class getClassDetails() throws SQLException;
}
