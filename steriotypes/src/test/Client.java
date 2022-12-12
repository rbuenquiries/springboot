package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controller.Car;

public class Client {
public static void main(String[] args) {
	//via xml/annotation classes loads here
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/car.xml");

	Car c=ap.getBean(Car.class);
	System.out.println(c.getEngine().getFuel().getFuelName());
}
}
