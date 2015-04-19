/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.dao;

import java.sql.SQLException;

import com.mycompany.spring.spring_framework.ioc.model.Lecturer;

/**
 * Data Access Object for Lecturer
 * 
 * @author colin
 *
 */
public interface LecturerDao {

	/**
	 * Gets the Lecturer data from the db
	 * 
	 * @return
	 */
	Lecturer getLecturer() throws SQLException;
}
