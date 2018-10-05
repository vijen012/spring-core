package com.springcore.propertiesannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springcore.domain.Company;

public class PropertiesAnnotation {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PropertyConfig.class);
		Company company = (Company) context.getBean("company");
		System.out.println(company);
		System.out.println("Corporate Slogan: "+ company.companyTagLine());
		((AnnotationConfigApplicationContext) context).close();
	}
}
