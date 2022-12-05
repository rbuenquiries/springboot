package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_dynamic_object.Iphone;

public class IOCTest {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/ioc.xml");
		// Rajesh wants to call
		Iphone p1 = ap.getBean(Iphone.class);
		p1.call();
		p1.text();

		// Iphone p2 = (Iphone) ap.getBean("p");
	}
}
