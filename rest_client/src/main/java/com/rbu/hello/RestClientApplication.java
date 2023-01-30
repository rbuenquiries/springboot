package com.rbu.hello;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class RestClientApplication {

	@Autowired
	RestTemplate restTemplate;

	@Bean
	public RestTemplate createRT() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

	@GetMapping("/client")
	public Student createStudent() {
		Student student = new Student();
		student.setName("anil");
		student.setEmail("anil@gmail.com");
		student.setAddress("PUNE");
		Student resp = restTemplate.postForObject("http://localhost:9090/api/student", student, Student.class);
		return resp;
	}

	@GetMapping("/getclient/{id}")
	public List<Student> selectStudent(@PathVariable Integer id) {
		Map<String, Integer> map=new HashMap<>();
		map.put("id", id);
 		ResponseEntity<Object> resp = restTemplate.getForEntity("http://localhost:9090/api/student/",
				Object.class,map);
 		return (List<Student>)resp.getBody();
	}

	@GetMapping("/delclient")
	public void deleteStudent() {
			restTemplate.delete("http://localhost:9090/api/student/1");
 	
	}

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);

	}

}
