/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.spring_framework.model.Student;
import com.mycompany.spring_framework.service.StudentService;

/**
 * @author colin
 *
 */
@Controller
public class StudentCreateController {

	@Autowired
	private StudentService studentService;
	
	/**
	 * Consumable Media Types
	 * 
	 * @param student
	 * @param model
	 */
	@RequestMapping(value = "/createStudent", method=RequestMethod.POST, 
			consumes="application/json")
	public void createStudentAPI (@RequestBody Student student, Model model) {
		if(studentService.addStudent(student)) {
			System.out.println("Successfully added student " + student);
		}
	}
}
