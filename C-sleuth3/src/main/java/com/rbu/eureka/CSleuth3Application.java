package com.rbu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CSleuth3Application {

	
	public static void main(String[] args) {
		SpringApplication.run(CSleuth3Application.class, args);
	}

	@GetMapping("ccall")
	public String cCleuthMethod() {
		try {
			
			Thread.sleep(1000*3);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return "cCleuthMethod response";
	}

}
