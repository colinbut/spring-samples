/**
 * 
 */
package com.mycompany.spring_framework.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.spring_framework.dao.StudentDataAccess;
import com.mycompany.spring_framework.model.Student;
import com.mycompany.spring_framework.model.UniversityClass;

/**
 * @author colin
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDataAccess studentDataAccess;
	
	@Autowired
	private UniversityClassService universityClassService;
	
	List<Student> students;
	
	@PostConstruct
	private void init() {
		students = studentDataAccess.getStudents();
		List<UniversityClass> classes = universityClassService.getUniversityTaughtClasses();
		
		for(int i = 0; i < students.size(); i++) {
			students.get(i).setClasses(classes);
		}
	}
	
	@Override
	public List<Student> getStudents() {
		return students;
	}

	@Override
	public Student findStudentByStudentId(int studentId) {
		
		if(!students.isEmpty()) {
			return students.get(studentId);
		}
		
		return null;
	}

}
