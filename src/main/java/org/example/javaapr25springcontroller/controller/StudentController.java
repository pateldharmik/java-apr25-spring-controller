package org.example.javaapr25springcontroller.controller;

import org.example.javaapr25springcontroller.dto.Student;
import org.example.javaapr25springcontroller.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

//@Controller
//@ResponseBody
//---Same Line of code---
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	//@RequestMapping(method = RequestMethod.GET,path = "/hello")
	//---Same line of code---
	@GetMapping("/hello/{lastName}")
	public String hello(@RequestParam("name") String name, @PathVariable("lastName") String lastName) {
		return "Hello World " + name +" "+lastName + "!";
	}

	@GetMapping("/class")
	public List<String> classStudents() {
		return Arrays.asList("Dharmik","Sunny","Utsav","Edward");
	}

	@PostMapping("/add/{action}")
	public List<Student> addStudent(@RequestBody Student student, @PathVariable("action") String action) {
		return studentService.addStudents(student,action);
	}
}
