/**
 * 
 */
package com.mycompany.spring_framework.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.spring_framework.model.Semester;
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
	
	/**
	 * URI Template Patterns - Path Variable
	 * 
	 * @param studentId
	 * @param model
	 * @return
	 */
	@RequestMapping(value ="/viewStudents/{studentId}", method=RequestMethod.GET)
	public String viewStudentDetails(@PathVariable int studentId, Model model) {
		Student student = studentService.findStudentByStudentId(studentId);
		model.addAttribute("student", student);
		return "studentDetails";
	}
	
	/**
	 * URI template patterns multiple path variables
	 * 
	 * @param studentId
	 * @param className
	 * @return
	 */
	@RequestMapping(value="/viewStudents/{studentId}/classes/{className}", method=RequestMethod.GET)
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
	
	/**
	 * Matrix Variables
	 * 
	 * e.g.
	 * cars;color=red;year=2013
	 * 
	 * 
	 * @param semester
	 */
	@RequestMapping(value = "/viewStudents/checkSemester/{semesterParam}/checkSemester/{semesterParam2}", 
			method=RequestMethod.GET)
	public String matrixVariables(
			@PathVariable String semesterParam,
			@PathVariable String semesterParam2,
			@MatrixVariable(value="p", pathVar="semesterParam") int p1,
			@MatrixVariable(value="p", pathVar="semesterParam2") int p2,
			@MatrixVariable(required = false, defaultValue = "1") int q ) {
		
		System.out.println("Value of q: " + q);
		System.out.println("Value of p1: " + p1);
		System.out.println("Value of p2: " + p2);
		
		Semester semester = Semester.valueOf(semesterParam);
		if(semester != null) {
			System.out.println("Access data for supplied semester: " + semesterParam);
		}
		
		return "studentDetails";
	}
	
	/**
	 * Producible Media Types
	 * 
	 * @param studentId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/viewStudentsAPI/{studentId}", method=RequestMethod.GET,
			produces="application/json")
	@ResponseBody
	public Student viewStudentDetailsAPI (@PathVariable int studentId, Model model) {
		return studentService.findStudentByStudentId(studentId);
	}

}
