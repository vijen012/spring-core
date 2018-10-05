package com.springcore.beanscope.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beanscope.domain.Company;

public class BeanScopeApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-company.xml");
		Company company1 = (Company) context.getBean("company");
		Company company2 = (Company) context.getBean("company");
		company2.setPostalCode("83484");
		System.out.println(company1);
		System.out.println(company2);
		
		if(company1 == company2) {
			System.out.println("Singleton scope test: company1 and company2 points to the same instance");
		} else {
			System.out.println("Singleton scope test: company1 and company2 both are separate instance");
		}
		
//		System.out.println(company.companyTagLine());
//		System.out.println(company.companyService());
		((ClassPathXmlApplicationContext) context).close();
	}
}
