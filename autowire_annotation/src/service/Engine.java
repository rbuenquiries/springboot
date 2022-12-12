package service;

import org.springframework.beans.factory.annotation.Autowired;

import dao.Fuel;

public class Engine {
	@Autowired// org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor conf this bean in xml
	private Fuel fuel;

	public Fuel getFuel() {
		return fuel;
	}

}
