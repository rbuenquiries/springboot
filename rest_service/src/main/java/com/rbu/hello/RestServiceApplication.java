package com.rbu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//component scan
//@SpringBootApplication(scanBasePackages = {"com.rbu.restapi","com.rbu.service","com.rbu.dao"})
@SpringBootApplication(scanBasePackages = {"com.*"})
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
