/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.spring_framework.model.Student;
import com.mycompany.spring_framework.model.UniversityClass;
import com.mycompany.spring_framework.service.StudentService;

/**
 * @author colin
 *
 */
@Controller
public class StudentDetailsController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value ="/viewStudents/{studentId}", method=RequestMethod.GET)
	public String viewStudentDetails(@PathVariable int studentId, Model model) {
		Student student = studentService.findStudentByStudentId(studentId);
		model.addAttribute("student", student);
		return "studentDetails";
	}
	
	@RequestMapping(value="/viewStudents/{studentId}/classes/{className}", method=RequestMethod.GET, 
			produces="application/json")
	public String viewClassDetails(@PathVariable int studentId, @PathVariable String className) {
		
		// get student
		Student student = studentService.findStudentByStudentId(studentId);
		
		UniversityClass clasz = null;
		
		List<UniversityClass> classes = student.getClasses();
		for(UniversityClass clazz : classes) {
			if (clazz.getName().equals(className) ) {
				clasz = clazz;
			}
		}
		
		return "studentDetails";
	}

}
