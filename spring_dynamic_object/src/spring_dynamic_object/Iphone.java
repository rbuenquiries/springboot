package spring_dynamic_object;

public class Iphone {
	public Iphone() {
		System.out.println("Iphone started");
	}

	private AirtelSim sim;

	// sim slot for airtel
	public void setSim(AirtelSim airtelSim) {
		System.out.println("airtel sim iserted");
		this.sim = airtelSim;
		System.out.println(airtelSim);
	}

	public void call() {
		if (sim == null)
			System.out.println("call with no sim so no calling");
		else
			sim.callANumber();
	}

	public void text() {

		if (sim == null)
			System.out.println("call with no sim so no text");
		else
			sim.textANumber();
	}
}
