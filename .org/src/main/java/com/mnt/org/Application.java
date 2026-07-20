package com.mnt.org;

import com.mnt.org.controller.TestRestEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@Component
public class Application {

	public static void main(String[] args) {

		//System.out.println(test);
        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SpringApplication.run(Application.class, args);
	}

}
