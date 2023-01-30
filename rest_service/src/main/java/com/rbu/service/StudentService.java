package com.rbu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rbu.dao.StudentDao;
import com.rbu.entities.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;

	public Student createStudent(Student student) throws Exception {
		return dao.save(student);
	}

	public Student updateStudent(Student student) throws Exception {
		return dao.update(student);
	}

	public void deleteStudent(Integer id) throws Exception {
		dao.delete(id);
	}

	public Student selectStudent(Integer id) throws Exception {
		return dao.selectOne(id);
	}

	public List<Student> selectAll() throws Exception {
		return dao.selectAll();
	}
}
