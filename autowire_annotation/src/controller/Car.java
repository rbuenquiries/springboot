package controller;

import org.springframework.beans.factory.annotation.Autowired;

import service.Engine;

public class Car {
	@Autowired
	private Engine engine;
	//no setter or no constructor
	
	public Engine getEngine() {
		return engine;
	}

}
