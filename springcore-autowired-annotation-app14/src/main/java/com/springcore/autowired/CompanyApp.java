package com.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springcore.domain.promotion.TradeFair;

public class CompanyApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-company.xml");
		TradeFair tradeFair = (TradeFair) context.getBean("tradeFair");
		System.out.println(tradeFair.specialPromotionalPricing());
		((ClassPathXmlApplicationContext) context).close();
	}
}
