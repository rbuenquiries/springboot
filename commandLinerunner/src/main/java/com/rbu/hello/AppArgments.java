package com.rbu.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class AppArgments implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunner");
		for(String ar:args) {
			System.out.println(ar);
		}
		
	}

}
