package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Customer;
import beans.Order;

public class Client {
public static void main(String[] args) {
	
	
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/test.xml");

	Order r=ap.getBean(Order.class);
	r.orderdate();
	Customer c=ap.getBean(Customer.class);
	c.customerdate();
}
}
