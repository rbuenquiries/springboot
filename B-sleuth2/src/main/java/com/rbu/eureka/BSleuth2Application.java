package com.rbu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class BSleuth2Application {
	@Bean
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(BSleuth2Application.class, args);
	}

	@GetMapping("bcall")
	public String bBsleuthMethod() {
		String response=createRestTemplate().getForObject("http://localhost:9093/ccall", String.class);
		return "bBsleuthMethod response:"+response;
	}

}
