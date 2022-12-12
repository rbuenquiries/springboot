package beans;

public class Car {

	private Engine engine;
	private Battery battery;
	private Audio audio;
	private RoofRails roofRails;

	public Car(Engine engine, Battery battery) {
		super();
		System.out.println("Car object");
		this.engine = engine;
		this.battery = battery;
	}

	public void setAudio(Audio audio) {
		System.out.println("audio inserting");
		this.audio = audio;
	}

	public void setRoofRails(RoofRails roofRails) {
		System.out.println("roofRails installing");
		this.roofRails = roofRails;
	}

}
