package com.example.demo.dao;


import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> 
{
	
    //List<User> findByLastname(String lastname);
  //  User findByEmailAddress(String emailAddress);
}


