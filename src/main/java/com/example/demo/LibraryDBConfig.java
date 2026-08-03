package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableJpaRepositories(
		basePackages = "com.example.demo.library.dao",
		entityManagerFactoryRef = "libraryEntityManagerFactory",
		transactionManagerRef = "libraryTransactionManager"
		)
public class LibraryDBConfig {

	 @Bean
	    @ConfigurationProperties(prefix="library.datasource")
	    public DataSource libraryDataSource() {
	        return DataSourceBuilder.create().build();
	    }
	 
	 @Bean
	    public LocalContainerEntityManagerFactoryBean libraryEntityManagerFactory(
	            EntityManagerFactoryBuilder builder) {

	        return builder
	                .dataSource(libraryDataSource())
	                .packages("com.example.demo.library.entity")
	                .persistenceUnit("library")
	                .build();
	    }
	 @Bean
	    public PlatformTransactionManager libraryTransactionManager(
	            @Qualifier("libraryEntityManagerFactory")
	            EntityManagerFactory emf) {

	        return new JpaTransactionManager(emf);
	    }
	
}
