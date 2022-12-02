package beans;

public class Jio implements Troi{
	public void calltonumber(String phoneNumber) {
		System.out.println("Invoke Jio network and call to ="+phoneNumber);
	}

	public void messagetonumber(String phoneNumber) {
		System.out.println("Invoke Jio network and text to ="+phoneNumber);
	}
}
