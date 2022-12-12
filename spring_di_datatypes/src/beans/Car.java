package beans;

public class Car {
	private Engine engine;
	private FordEngine engine2;

	// fiat
	public Car(Engine engine) {
		System.out.println("fiat const");
		System.out.println(engine.getEngname());
		System.out.println(engine);
	}

	// Ford
	/*
	 * public Car(FordEngine engine2) { System.out.println("Ford const");
	 * System.out.println(engine2.getModel()); }
	 */

}
