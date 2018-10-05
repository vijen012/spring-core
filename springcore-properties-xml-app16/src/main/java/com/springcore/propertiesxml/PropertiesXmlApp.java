package com.springcore.propertiesxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.domain.Company;

public class PropertiesXmlApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-company.xml");
		Company company = (Company) context.getBean("company");
		System.out.println(company);
		
//		TradeFair tradeFair = (TradeFair) context.getBean("tradeFair");
//		System.out.println(tradeFair.specialPromotionalPricing());
		((ClassPathXmlApplicationContext) context).close();
	}
}
