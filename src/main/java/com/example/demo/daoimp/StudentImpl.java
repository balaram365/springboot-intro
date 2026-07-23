package com.example.demo.daoimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentImpl implements StudentDAO{

	private EntityManager entityManager;
	
	@Autowired  //constructor injection
	public StudentImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Transactional //springframework
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		entityManager.persist(student);
	}

	
}
