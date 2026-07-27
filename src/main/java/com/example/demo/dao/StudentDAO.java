package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Student;


public interface StudentDAO {
 
  
  void save(Student student);
	Student findById(int id);
	
	List<Student> findAll();
	
	void delete(int id);

	void update(Student student);
	
}
