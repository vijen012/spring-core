package com.springcore.di.domain;

import core.springcore.di.service.BusinessService;

public class Company {
	private String companyName;
	private int yearOfIncorporation;
	private int employeeCount;
	private String postalCode;
	private String tagLine;
	private BusinessService businessService;
	
	public Company(String companyName, int yearOfIncorporation) {		
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}
	
	//setters based dependency injection
	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public String companyTagLine(){
		return tagLine;
	}
	
	public String companyService(){
		return businessService.offerService(companyName);
	}
	
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", employeeCount=" + employeeCount + ", postalCode=" + postalCode + "]";
	}
}
