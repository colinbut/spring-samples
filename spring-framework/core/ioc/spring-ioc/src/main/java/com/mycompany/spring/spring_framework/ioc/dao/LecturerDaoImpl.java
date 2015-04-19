/**
 * 
 */
package com.mycompany.spring.spring_framework.ioc.dao;

import com.mycompany.spring.spring_framework.ioc.model.Lecturer;

/**
 * Implementation of LecturerDao
 * 
 * @author colin
 *
 */
public class LecturerDaoImpl implements LecturerDao {

	/*
	 * (non-Javadoc)
	 * @see com.mycompany.spring.spring_framework.ioc.dao.LecturerDao#getLecturer()
	 */
	@Override
	public Lecturer getLecturer() {
		
		Lecturer lecturer = new Lecturer();
		lecturer.setName("Lecturer Name");
		
		return lecturer;
	}

}
