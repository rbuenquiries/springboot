package beans;

public class User {
	public static void main(String[] args) {

		String phoneNumber = "9182662482";
		String sim1= "beans.Airtel";
		String sim2= "beans.Jio";

		NewPhone p = new NewPhone();
		p.call(phoneNumber, sim1);
		p.message(phoneNumber, sim2);
	}
}
