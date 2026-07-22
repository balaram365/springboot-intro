package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.controller.TestRestEndPoint;

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

}
