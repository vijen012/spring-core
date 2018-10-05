package core.springcore.ioc.setters;

public class Company {
	private String companyName;
	private int yearOfIncorporation;
	private int employeeCount;
	private String postalCode;
	
	public Company(String companyName, int yearOfIncorporation) {		
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}
	
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", employeeCount=" + employeeCount + ", postalCode=" + postalCode + "]";
	}
}
