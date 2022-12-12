package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/car.xml");

	}
}
