/**
 * 
 */
package com.mycompany.spring_framework.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.mycompany.spring_framework.model.Student;

/**
 * @author colin
 *
 */
@Repository
public class StudentDataAccessImpl implements StudentDataAccess {

	@Override
	public List<Student> getStudents() {
		
		List<Student> students = new ArrayList<>();
		
		for(int i = 1; i <= 25; i++) {
			Student student = new Student();
			student.setStudentId(i);
			student.setSurname("Surname" + i);
			student.setMiddlenames("Middlenames" + i);
			student.setForename("Forename" + i);
			student.setAge(new Random().nextInt(30));
			student.setAddress("Address" + i);
			student.setYearOfStudy(new Random().nextInt(5)+1);
			students.add(student);
		}
		
		return students;
	}

}
