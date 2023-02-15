package com.rbu.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RbubusConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbubusConfigServerApplication.class, args);
	}

}
