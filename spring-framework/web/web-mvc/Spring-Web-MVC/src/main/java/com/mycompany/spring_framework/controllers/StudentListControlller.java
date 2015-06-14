/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.spring_framework.service.StudentService;

/**
 * @author colin
 *
 */
@Controller
public class StudentListControlller {

	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value="/viewStudents", method=RequestMethod.GET)
	public String showStudentListPage(ModelMap map) {
		
		map.addAttribute("students", studentService.getStudents());
		
		return "studentList";
	}
	
}
