package controller;

import service.Engine;

public class Car {

	private Engine engine;

	public Car(Engine engine) {
		System.out.println("IOC  setting Engine property  via autowiring");
		this.engine = engine;
	}

	

	public Engine getEngine() {
		return engine;
	}

}
