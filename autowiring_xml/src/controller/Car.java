package controller;

import service.Engine;

public class Car {

	private Engine engine;

	public void setEngine(Engine engine) {
		System.out.println("IOC  setting Engine property  via autowiring");
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

}
