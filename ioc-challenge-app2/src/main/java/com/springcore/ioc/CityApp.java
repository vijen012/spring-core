package com.springcore.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CityApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-challenge.xml");
		City city = (City) context.getBean("city");
		city.getCity("Bangalore");
		((ClassPathXmlApplicationContext) context).close();	
	}
}
