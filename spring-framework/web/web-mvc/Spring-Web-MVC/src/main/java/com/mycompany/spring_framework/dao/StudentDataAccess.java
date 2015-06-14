/**
 * 
 */
package com.mycompany.spring_framework.dao;

import java.util.List;

import com.mycompany.spring_framework.model.Student;

/**
 * @author colin
 *
 */
public interface StudentDataAccess {

	List<Student> getStudents();
}
