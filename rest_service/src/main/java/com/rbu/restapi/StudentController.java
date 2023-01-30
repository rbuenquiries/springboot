package com.rbu.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbu.entities.Student;
import com.rbu.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	StudentService service;

	public StudentController() {
		System.out.println("StudentController");
	}

	@PostMapping
	public ResponseEntity<Student> create(@RequestBody Student student) throws Exception {
	return new ResponseEntity<>(service.createStudent(student), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Student> update(@RequestBody Student student) throws Exception {
			return new ResponseEntity<>(service.updateStudent(student), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(Integer id) throws Exception {
		service.deleteStudent(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Student>> select() throws Exception {
		return new ResponseEntity<>(service.selectAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> selectone(Integer id) throws Exception {
		return new ResponseEntity<>(service.selectStudent(id), HttpStatus.OK);
	}
}
