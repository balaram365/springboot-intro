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
import com.example.demo.dao.CourseDAO;
import com.example.demo.dao.StudentDAO;
import com.example.demo.dao.UserRepository;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.library.dao.LibraryDAO;
import com.example.demo.library.entity.Library;



@SpringBootApplication
public class NewApplication {

//	@Autowired
//	static TestRestEndPoint testRestEndPoint;
	public static void main(String[] args) {
		 

		
//		 String test = testRestEndPoint.testApp();
//		 System.out.println(test);
		SpringApplication.run(NewApplication.class, args);
		
		//ioc -> spring inverson controller of beans
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}
		@Bean
		public CommandLineRunner commandLineRunner(StudentDAO studentDAO ,CourseDAO courseDAO,LibraryDAO libraryDAO, UserRepository repository) {
			return runner->{
				//createStudent(studentDAO);
				//findStudent(studentDAO,2);
				//findStudentAll(studentDAO);
			//	deleteStudent(studentDAO);
				//updateStudent(studentDAO);
				//displayStudentCourses(courseDAO);
				//displayBooks(libraryDAO);
				crudDisplay(repository);
								
			};
			
		}
		
		private void crudDisplay(UserRepository repository) {
			 System.out.println("All Customers");
		        repository.findAll().forEach(System.out::println);
		        
		}
		private void displayBooks(LibraryDAO libraryDAO) {
			List<Library> books = libraryDAO.findAll();
			System.out.println(books);
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
		
		private void displayStudentCourses(CourseDAO courseDAO) {
			  
		    List<Student> students = courseDAO.findStudentWithCourses();

		    for (Student student : students) {

		        System.out.println("Student : " + student.getFirstName());

		        for (Course course : student.getCourses()) {

		            System.out.println("Course : " + course.getCourseName());
		        }

		        System.out.println("-------------------");
		    }
		}
}

