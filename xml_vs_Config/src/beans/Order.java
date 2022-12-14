package beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Order {
	@Autowired
	Date date;
	public Order() {
		System.out.println("swiggy orders");
	}
	public void orderdate() {
		System.out.println("order date"+date);
	}

}
