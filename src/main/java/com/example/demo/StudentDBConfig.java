package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@Primary
@EnableJpaRepositories(
		basePackages = "com.example.demo.dao",
		entityManagerFactoryRef = "studentEntityManagerFactory",
        transactionManagerRef = "studentTransactionManager"
		)
public class StudentDBConfig {

	 @Primary
	    @Bean
	    @ConfigurationProperties(prefix="spring.datasource")
	    public DataSource studentDataSource() {
	        return DataSourceBuilder.create().build();
	    }
	 
	 @Primary
	    @Bean
	    public LocalContainerEntityManagerFactoryBean studentEntityManagerFactory(
	            EntityManagerFactoryBuilder builder) {

	        return builder
	                .dataSource(studentDataSource())
	                .packages("com.example.demo.entity")
	                .persistenceUnit("student")
	                .build();
	    }
	 
	 @Primary
	    @Bean
	    public PlatformTransactionManager studentTransactionManager(
	            @Qualifier("studentEntityManagerFactory")
	            EntityManagerFactory emf) {

	        return new JpaTransactionManager(emf);
	    }
}
