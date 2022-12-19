package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rbu.dao.StudentDao;

public class Main {

	public static void main(String... args) {
//you IOC is like tomcat and weblogic
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/ioc.xml");

//provide object to customer
		StudentDao dao = (StudentDao) ap.getBean("st");
		dao.saveStudent(5, "rajesh", "rajesh@gmail.com", "hyd");
		dao.saveStudent(6, "sesh", "sesh@gmail.com", "hyd");
		dao.saveStudent(7, "MD", "MD@gmail.com", "hyd");
		dao.saveStudent(8, "uma", "uma@gmail.com", "hyd");

		ap.close();//shutdown
		
	}

}