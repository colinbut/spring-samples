/**
 * 
 */
package com.mycompany.spring_framework.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mycompany.spring_framework.model.Semester;
import com.mycompany.spring_framework.model.UniversityClass;

/**
 * @author colin
 *
 */
@Repository
public class UniversityClassesDataAccessImpl implements UniversityClassesDataAccess {

	@Override
	public List<UniversityClass> getListOfUniversityClassesFromDataStore() {
		
		List<UniversityClass> classes = new ArrayList<>();
		
		for(int i = 1; i <= 25; i++ ) {
			
			UniversityClass universityClass = new UniversityClass();
			universityClass.setName("Class" + i);
			universityClass.setSemester((i % 3 == 0 ? Semester.SEMESTER_1 : Semester.SEMESTER_2));
			classes.add(universityClass);
		}
		
		return classes;
	}

}
