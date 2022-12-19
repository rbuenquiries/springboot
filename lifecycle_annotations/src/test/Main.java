package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rbu.dao.StudentDao;

public class Main {

	public static void main(String... args) {
//you IOC is like tomcat and weblogic
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resources/test.xml");

//provide object to customer
		StudentDao dao = ap.getBean(StudentDao.class);
		dao.saveStudent(9, "pradeep", "pradeep@gmail.com", "hyd");
		dao.saveStudent(10, "parvati", "parvati@gmail.com", "hyd");
		dao.saveStudent(11, "yamuna", "yamuna@gmail.com", "hyd");
		dao.saveStudent(12, "mukesh", "mukesh@gmail.com", "hyd");

		ap.close();//shutdown
		
	}

}