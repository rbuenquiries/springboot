package beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Customer {
	@Autowired
	Date date;
	public Customer() {
		System.out.println("swiggy Customer");
	}
	public void customerdate() {
		System.out.println("custome date"+date);
	}
}
