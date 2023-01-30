package com.rbu.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//component-scan base-package=com.rbu
@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		//ApplicationContext ap=new ClassPathXmlApplicationContext("xml");
		ApplicationContext ap = SpringApplication.run(HelloworldApplication.class, args);
		HelloWorld hw=ap.getBean(HelloWorld.class);
		hw.hello("Ranjan");
		
	}

}
