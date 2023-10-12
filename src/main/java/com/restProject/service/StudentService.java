package com.restProject.service;

import java.util.List;


import com.restProject.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public Student addStudent(Student student);
	public Student getStudent(int id);
	public Student updateStudent(Student student);
	public void deleteStudent(int id);
	public List<Student> getPaginated();

}
