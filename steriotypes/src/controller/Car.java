package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.Engine;

@Controller
public class Car {
	@Autowired
	private Engine engine;
	//no setter or no constructor
	public Car() {
	System.out.println("Car object created");
	}
	public Engine getEngine() {
		return engine;
	}

}
