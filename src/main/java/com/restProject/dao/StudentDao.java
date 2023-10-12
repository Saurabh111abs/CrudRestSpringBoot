package com.restProject.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.restProject.entity.Student;






public interface StudentDao extends JpaRepository<Student, Integer> {
	
	public Student findById(int id);

	


}
