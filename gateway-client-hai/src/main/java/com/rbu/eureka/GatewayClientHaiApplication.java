package com.rbu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GatewayClientHaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayClientHaiApplication.class, args);
	}
	@GetMapping("/hai")
	public String hai() {
		return "Hai Message";
	}
}
