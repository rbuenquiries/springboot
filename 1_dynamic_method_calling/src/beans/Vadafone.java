package beans;

public class Vadafone implements Troi {
	public void calltonumber(String phoneNumber) {
		System.out.println("Invoke Vadafone network and call to ="+phoneNumber);
	}

	public void messagetonumber(String phoneNumber) {
		System.out.println("Invoke Vadafone network and text to ="+phoneNumber);
	}
}
