package core.springcore.di.setters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.di.domain.Company;
import com.springcore.di.domain.HumanResourceDept;

public class CompanyApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-company.xml");
		Company company = (Company) context.getBean("company");
		System.out.println(company);
		System.out.println(company.companyTagLine());
		System.out.println(company.companyService());
		System.out.println("**********************Constructor based dependency injection*********************");
		HumanResourceDept hrdept = (HumanResourceDept) context.getBean("hrdept");
		System.out.println(hrdept.hiringStatus(7500));
		((ClassPathXmlApplicationContext) context).close();
	}
}
