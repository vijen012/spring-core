package core.springcore.beanfactory;

public class Company {
	private String companyName;
	private int yearOfIncorporation;
	
	public Company(String companyName, int yearOfIncorporation) {		
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}
	
	public static Company createInstance(String companyName, int yearOfIncorporation) {
		System.out.println("Invoking the static factory method ..........");
		return new Company(companyName, yearOfIncorporation);
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
}
