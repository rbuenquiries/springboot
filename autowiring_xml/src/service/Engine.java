package service;

import dao.Fuel;

public class Engine {

	private Fuel fuel;

	public void setFuel(Fuel fuel) {
		System.out.println("IOC  setting Fuel property  via autowiring");
		this.fuel = fuel;
	}

	public Fuel getFuel() {
		return fuel;
	}

}
