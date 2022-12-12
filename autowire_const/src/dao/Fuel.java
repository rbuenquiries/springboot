package dao;

public class Fuel {
	private String fuelName;

	public void setFuelName(String fuelName) {
		System.out.println("developer setting this property value via xml file");
		this.fuelName = fuelName;
	}

	public String getFuelName() {
		return fuelName;
	}

}
