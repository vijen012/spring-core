package core.springcore.beanfactory;

public class CompanyFactory {
	
	public Company getInstance(String companyName, int yearOfIncorporation) {
		System.out.println("Invoking the instance factory mehtod.........");
		return new Company(companyName, yearOfIncorporation);
	}
}
