package com.example.demo.library.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

//import com.example.demo.entity.Library;
import com.example.demo.library.dao.LibraryDAO;
import com.example.demo.library.entity.Library;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class LibraryImpl implements LibraryDAO{
	 @PersistenceContext(unitName="library")
	    private EntityManager entityManager;
	@Override
	public List<Library> findAll() {
		TypedQuery<Library> query =
             entityManager.createQuery("FROM Library",Library.class);

     return query.getResultList();
	}
}
