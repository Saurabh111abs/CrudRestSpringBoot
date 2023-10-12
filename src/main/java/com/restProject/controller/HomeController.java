package com.restProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restProject.entity.Student;
import com.restProject.service.StudentService;

@RestController
public class HomeController {
	
	@Autowired
	private StudentService studentService;
	
	//get all students
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		
		return studentService.getAllStudents();
	}
	
	//add a student
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		
		return studentService.addStudent(student);
	}
	
	   //get the single course
		@GetMapping("/students/{id}")
		public Student getStudent(@PathVariable int id) {
			
			return this.studentService.getStudent(id);
		}
	//update a student 
		@PutMapping("/students")
		public Student updateStudent(@RequestBody Student student) {
			
			return studentService.updateStudent(student);
		}
	//delete a student
		@DeleteMapping("/students/{id}")
		public void deleteStudent(@PathVariable("id") int id) {
			
		studentService.deleteStudent(id);
		}
	//applying pagination
		@GetMapping("/page")
		public List<Student> getPaginated(){
			
			return studentService.getPaginated();
			
		}

}
