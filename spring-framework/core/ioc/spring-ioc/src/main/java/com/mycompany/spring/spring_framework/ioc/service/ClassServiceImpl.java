/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.service;

import java.sql.SQLException;

import com.mycompany.spring.spring_framework.ioc.dao.ClassDao;
import com.mycompany.spring.spring_framework.ioc.model.Class;

/**
 * Implementation of ClassService
 * 
 * @author colin
 *
 */
public class ClassServiceImpl implements ClassService {
	
	private ClassDao dao;
	
	/**
	 * Constructor
	 * 
	 * @param dao
	 */
	public ClassServiceImpl(ClassDao dao){
		this.dao = dao;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.ioc.service.ClassService#getClassDetails()
	 */
	@Override
	public Class getClassDetails() {
		
		Class uniClass = null;
		
		try {
			uniClass = dao.getClassDetails();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e){
			//
		}
		
		return uniClass;
		
	}

}
