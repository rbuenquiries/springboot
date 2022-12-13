package com.rbu.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Fuel {
	@Value("${fulename}")
	private String fuelName;
	public Fuel() {
	System.out.println("Fuel object created");
	}

	public void setFuelName(String fuelName) {
		System.out.println("developer setting this property value via xml file");
		this.fuelName = fuelName;
	}

	public String getFuelName() {
		return fuelName;
	}

}
