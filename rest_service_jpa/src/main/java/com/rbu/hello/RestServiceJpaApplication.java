package com.rbu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.*"})
@EntityScan("com.rbu.entities")
@EnableJpaRepositories("com.rbu.dao")
@EnableTransactionManagement
public class RestServiceJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceJpaApplication.class, args);
	}

}
