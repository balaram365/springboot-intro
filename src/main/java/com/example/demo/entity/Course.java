package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



	
	@Entity
	@Table(name="course")
	public class Course {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name="course_name")
	    private String courseName;

	    @ManyToOne
	    @JoinColumn(name="student_id")
	    private Student student;

	 // Getters and Setters
	    
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public Course(int id, String courseName, Student student) {
		
			this.id = id;
			this.courseName = courseName;
			this.student = student;
		}

		public Course() {
			super();
		}

		
	    
	}


