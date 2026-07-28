package com.example.demo.daoimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.CourseDAO;
import com.example.demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class CourseImpl implements CourseDAO {

	private EntityManager entityManager;

    @Autowired
    public CourseImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
	@Override
	public List<Student> findStudentWithCourses() {
		TypedQuery<Student> query =
	            entityManager.createQuery(
	                    "SELECT DISTINCT s FROM Student s JOIN FETCH s.courses",
	                    Student.class);
 
	    return query.getResultList();
	}
	
	

}
