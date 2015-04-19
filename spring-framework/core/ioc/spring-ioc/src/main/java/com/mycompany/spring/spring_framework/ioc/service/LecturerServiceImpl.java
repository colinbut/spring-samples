/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.service;

import java.sql.SQLException;

import com.mycompany.spring.spring_framework.ioc.dao.LecturerDao;
import com.mycompany.spring.spring_framework.ioc.model.Lecturer;

/**
 * Implementation of LecturerService
 * 
 * @author colin
 *
 */
public class LecturerServiceImpl implements LecturerService {

	private LecturerDao dao;
	
	/**
	 * Constructor
	 * 
	 * @param dao
	 */
	public LecturerServiceImpl(LecturerDao dao) {
		this.dao = dao;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.ioc.service.LecturerService#getLecturer()
	 */
	@Override
	public Lecturer getLecturer() {
		
		Lecturer lecturer = null;
		
		try {
			lecturer = dao.getLecturer();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e){
			//
		}
		
		return lecturer;
	}

}
