package beans;

public class Airtel implements Troi{
	public void calltonumber(String phoneNumber) {
		System.out.println("Invoke Airtel network and call to ="+phoneNumber);
	}

	public void messagetonumber(String phoneNumber) {
		System.out.println("Invoke Airtel network and text to ="+phoneNumber);
	}
}
