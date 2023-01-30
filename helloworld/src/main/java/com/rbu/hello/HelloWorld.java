package com.rbu.hello;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	public HelloWorld() {
	System.out.println("HelloWorld object created");
	}
	
	public void hello(String name) {
		System.out.println("Hello...."+name);
	}
//<bean class=HelloWorld id=hw/> 
//no xml in sb

}
