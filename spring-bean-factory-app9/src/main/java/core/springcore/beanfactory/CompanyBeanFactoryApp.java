package core.springcore.beanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyBeanFactoryApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-company.xml");
		//instantiate bean using static factory
		Company companyStaticFactory = (Company) context.getBean("companyStaticFactory");
		System.out.println(companyStaticFactory);
		
		//instantiate bean using instance factory
		Company companyInstanceFactory = (Company) context.getBean("companyInstanceFactory");
		System.out.println(companyInstanceFactory);
		((ClassPathXmlApplicationContext) context).close();
	}
}
