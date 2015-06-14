/**
 * 
 */
package com.mycompany.spring_framework.service;

import java.util.List;

import com.mycompany.spring_framework.model.Student;

/**
 * @author colin
 *
 */
public interface StudentService {

	List<Student> getStudents();
	
	Student findStudentByStudentId(int studentId);
	
	boolean addStudent(Student student);
}
