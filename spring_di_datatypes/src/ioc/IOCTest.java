package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Phone;

public class IOCTest {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/ioc.xml");

		Phone p = ap.getBean(Phone.class);
		System.out.println(p);
	}
}
