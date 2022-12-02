package beans;

public class NewPhone {
	private String name = "Iphone14";

	public void call(String phoneNumber, String provider) {
		try {
			// any sim object //Airtel
			Object o = Class.forName(provider).newInstance();
			// consuming object via parent ref
			Troi t = (Troi) o;
			t.calltonumber(phoneNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void message(String phoneNumber, String provider) {
		try {
			// any sim object //Jio
			Object o = Class.forName(provider).newInstance();
			// consuming object via parent ref
			Troi t = (Troi) o;
			t.messagetonumber(phoneNumber);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
