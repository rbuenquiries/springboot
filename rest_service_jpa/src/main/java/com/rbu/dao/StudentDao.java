package com.rbu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbu.entities.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	
}
