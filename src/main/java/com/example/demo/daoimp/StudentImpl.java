package com.example.demo.daoimp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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
	
	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<Student> resultList=entityManager.createQuery("From Student",Student.class);
//		Query resultQuery=entityManager.createQuery("select s.id, s.firstName, s.lastName,s.email from Student s");
//		
//		List<Object[]> result = resultQuery.getResultList();
//		List<List<Object>> values = result.stream()
//		        .map(Arrays::asList)
//		        .toList();
//
//		System.out.println(values);
		return resultList.getResultList();
	}
	
	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		Student student = entityManager.find(Student.class,id);
		if(student!=null) {
			entityManager.remove(student);
		}
	}

	@Override
	@Transactional
	public void update(Student student) {
		// TODO Auto-generated method stub
		
		    entityManager.merge(student);

		}
		
	}
	
