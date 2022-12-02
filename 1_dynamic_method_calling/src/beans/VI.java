package beans;

public class VI implements Troi{
	public void calltonumber(String phoneNumber) {
		System.out.println("Invoke VI network and call to ="+phoneNumber);
	}

	public void messagetonumber(String phoneNumber) {
		System.out.println("Invoke VI network and text to ="+phoneNumber);
	}
}
