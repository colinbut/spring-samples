/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.dao;

import java.sql.SQLException;

import com.mycompany.spring.spring_framework.ioc.model.Class;

/**
 * Implementation of the ClassDao
 * 
 * @author colin
 *
 */
public class ClassDaoImpl implements ClassDao{

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.ioc.dao.ClassDao#getClassDetails()
	 */
	@Override
	public Class getClassDetails() throws SQLException {
		
		Class uniClass = new Class();
		uniClass.setName("Class");
		
		
		return uniClass;
	}

}
