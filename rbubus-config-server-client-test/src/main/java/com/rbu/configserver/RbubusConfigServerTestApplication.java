package com.rbu.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class RbubusConfigServerTestApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext cap=	SpringApplication.run(RbubusConfigServerTestApplication.class, args);
	ConfigReader conf=cap.getBean(ConfigReader.class);
	System.out.println(conf);
	}

}
