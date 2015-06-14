/**
 * 
 */
package com.mycompany.spring_framework.dao;

import java.util.List;

import com.mycompany.spring_framework.model.UniversityClass;

/**
 * @author colin
 *
 */
public interface UniversityClassesDataAccess {
	
	List<UniversityClass> getListOfUniversityClassesFromDataStore();
	
}
