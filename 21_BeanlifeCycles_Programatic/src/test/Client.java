package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	
	//tomcat->DS starts
	ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("resources/test.xml");
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//tomcat->DS call shutdown
	cap.close();//shutdown IOC
	
}
}
