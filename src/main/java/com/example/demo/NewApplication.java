package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.controller.TestRestEndPoint;
import com.example.demo.dao.StudentDAO;
import com.example.demo.entity.Student;

@SpringBootApplication
public class NewApplication {

//	@Autowired
//	static TestRestEndPoint testRestEndPoint;
	public static void main(String[] args) {
		 
		
//		
//		 String test = testRestEndPoint.testApp();
//		 System.out.println(test);
		SpringApplication.run(NewApplication.class, args);
		
		//ioc -> spring inverson controller of beans
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
		@Bean
		public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
			return runner->{
				//createStudent(studentDAO);
				//findStudent(studentDAO,2);
				findStudentAll(studentDAO);
			//	deleteStudent(studentDAO);
				//updateStudent(studentDAO);
			};
			
		}
		private void createStudent(StudentDAO studentDAO) {
			// TODO Auto-generated method stub
			Student details = new Student("Balaram","krishna","balaram@gamil.com");
			studentDAO.save(details);	
			System.out.println("save id "+details.getId());
			
		
		}
		
		private void findStudent(StudentDAO studentDAO,int id) {
			
			Student output = studentDAO.findById(id);

		       System.out.println("details "+output.getId());
		       System.out.println("details "+output.getFirstName());
		}
		
		private void findStudentAll(StudentDAO studentDAO) {

	        //Student output = studentDAO.findById(id);
		        List<Student> results= studentDAO.findAll();	
		        System.out.println(results);
		}
		private void deleteStudent(StudentDAO studentDAO) {
			  int studentid=3;
			  studentDAO.delete(studentid);
			  System.out.println("Deleted student with id: "+studentid);
		  }
		
		private void updateStudent(StudentDAO studentDAO) {

		    // Fetch student with id = 1
		    Student student = studentDAO.findById(4);

		    // Update values
		    student.setFirstName("Rahul");
		    student.setLastName("Sharma");
		    student.setEmail("rahul@gmail.com");

		    // Save changes
		    studentDAO.update(student);

		    System.out.println("Student updated successfully.");
		}
}

