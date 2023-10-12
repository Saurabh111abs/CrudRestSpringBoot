package com.restProject.service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.restProject.dao.StudentDao;
import com.restProject.entity.Student;
@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getAllStudents() {
		
	List<Student> list = this.studentDao.findAll();
	
	return list;
		
	}

	@Override
	public Student addStudent(Student student) {
		     Student s = studentDao.save(student);
		return s;
	}

	@Override
	public Student getStudent(int id) {
		 Student student1 = studentDao.findById(id);
		 return student1;
		
	}

	@Override
	public Student updateStudent(Student student) {
		Student student1 = studentDao.save(student);
		return student1;
	}

	@Override
	public void deleteStudent(int id) {
		  studentDao.deleteById(id);
	}

	@Override
	public List<Student> getPaginated() {
		int pageSize=10;
		int pageNum=1;
		Pageable p = (Pageable) PageRequest.of(pageNum, pageSize);
		
		return null;
	}






}
