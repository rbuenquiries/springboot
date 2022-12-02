package beans;

public class Idea implements Troi{
	public void calltonumber(String phoneNumber) {
		System.out.println("Invoke Idea network and call to ="+phoneNumber);
	}

	public void messagetonumber(String phoneNumber) {
		System.out.println("Invoke Idea network and text to ="+phoneNumber);
	}
}
