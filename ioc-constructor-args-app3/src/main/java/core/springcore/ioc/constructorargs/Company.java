package core.springcore.ioc.constructorargs;

public class Company {
	private String companyName;
	private int yearOfIncorporation;
	
	public Company(String companyName, int yearOfIncorporation) {		
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}
}
