package com.example.springcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcache.domain.Student;
import com.example.springcache.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student/{id}")
	public Student findStudentById(@PathVariable int id) {
		System.out.println("Searching by ID  : " + id);
		return studentService.getStudentByID(id);
	}
	
	@GetMapping("/studentCE/{id}")
	public Student getStudentByIdCE(@PathVariable int id) {
		return studentService.getStudentByIdCE(id);
	}
	
	@GetMapping("/studentCP/{id}")
	public Student updateStudentName(@PathVariable int id) {
		return studentService.updateStudentName(id);
	}
}
