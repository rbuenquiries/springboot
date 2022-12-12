package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Fuel;

@Service
public class Engine {
	@Autowired // org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor
				// conf this bean in xml
	private Fuel fuel;

	public Engine() {
		System.out.println("Engine object created");
	}

	public Fuel getFuel() {
		return fuel;
	}

}
