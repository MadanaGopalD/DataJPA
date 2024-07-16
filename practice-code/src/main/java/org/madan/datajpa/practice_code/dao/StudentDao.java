package org.madan.datajpa.practice_code.dao;

import org.madan.datajpa.practice_code.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class StudentDao {
	
	@PersistenceContext
//	@Autowired
	EntityManager entityManager;

	@Transactional
	public void saveStudent(Student stu) {
		entityManager.persist(stu);
		System.out.println("Student objct saved");
	}
}
