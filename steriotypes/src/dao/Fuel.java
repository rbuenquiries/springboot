package dao;

import org.springframework.stereotype.Repository;

@Repository
public class Fuel {
	private String fuelName="Petrol";
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
