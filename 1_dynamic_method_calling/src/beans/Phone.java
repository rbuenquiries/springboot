package beans;

public class Phone {
	private String name = "Reliance";

	public void call(String phoneNumber, String provider) {
		if (provider.contains("Jio")) {
			try {
				Object o = Class.forName(provider).newInstance();
				Jio j = (Jio) o;
				System.out.println("calling to sim");
				j.calltonumber(phoneNumber);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (provider.contains("VI")) {
			try {
				Object o = Class.forName(provider).newInstance();
				VI j = (VI) o;
				System.out.println("calling to sim");
				j.calltonumber(phoneNumber);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (provider.contains("Idea")) {
			try {
				Object o = Class.forName(provider).newInstance();
				Idea j = (Idea) o;
				System.out.println("calling to sim");
				j.calltonumber(phoneNumber);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (provider.contains("Airtel")) {
			try {
				Object o = Class.forName(provider).newInstance();
				Airtel j = (Airtel) o;
				System.out.println("calling to sim");
				j.calltonumber(phoneNumber);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void message(String phoneNumber, String provider) {
		if (provider.contains("jio")) {
			try {
				Object o = Class.forName(provider).newInstance();
				Jio j = (Jio) o;
				System.out.println("text to sim");
				j.messagetonumber(phoneNumber);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		if (provider.contains("VI")) {
			try {
				Object o = Class.forName(provider).newInstance();
				Jio j = (Jio) o;
				System.out.println("text to sim");
				j.messagetonumber(phoneNumber);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		if (provider.contains("Airtel")) {
			try {
				Object o = Class.forName(provider).newInstance();
				Jio j = (Jio) o;
				System.out.println("text to sim");
				j.messagetonumber(phoneNumber);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if (provider.contains("Idea")) {
			try {
				Object o = Class.forName(provider).newInstance();
				Jio j = (Jio) o;
				System.out.println("text to sim");
				j.messagetonumber(phoneNumber);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
