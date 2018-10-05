package com.springcore.di.setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.di.domain.Company;

public class CompanyApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-company.xml");
		Company company = (Company) context.getBean("company");
		System.out.println(company);
		System.out.println(company.companyTagLine());
		System.out.println(company.companyService());
		((ClassPathXmlApplicationContext) context).close();
	}
}
