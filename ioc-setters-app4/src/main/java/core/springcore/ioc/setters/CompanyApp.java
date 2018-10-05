package core.springcore.ioc.setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-company.xml");
		Company company = (Company) context.getBean("company");
		System.out.println(company);
		((ClassPathXmlApplicationContext) context).close();
	}
}
