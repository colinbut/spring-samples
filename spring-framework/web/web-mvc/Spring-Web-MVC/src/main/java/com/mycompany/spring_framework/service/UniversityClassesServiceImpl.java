/**
 * 
 */
package com.mycompany.spring_framework.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.spring_framework.dao.UniversityClassesDataAccess;
import com.mycompany.spring_framework.model.UniversityClass;

/**
 * @author colin
 *
 */
@Service
public class UniversityClassesServiceImpl implements UniversityClassService {

	@Autowired
	private UniversityClassesDataAccess universityClassesDataAccess;
	
	@Override
	public List<UniversityClass> getUniversityTaughtClasses() {
		return universityClassesDataAccess.getListOfUniversityClassesFromDataStore();
	}

}
