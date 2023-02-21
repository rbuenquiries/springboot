package com.rbu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ASleuth1Application {

	@Bean
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ASleuth1Application.class, args);
	}

	@GetMapping("acall")
	public String aAsleuthMethod() {
		String response=createRestTemplate().getForObject("http://localhost:9092/bcall", String.class);
		return "aAsleuthMethod response:"+response;
	}


}
