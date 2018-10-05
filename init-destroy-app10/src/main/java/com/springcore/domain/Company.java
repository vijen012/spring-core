package com.springcore.domain;

import com.springcore.service.BusinessService;

public class Company {
	private String companyName;
	private int yearOfIncorporation;
	private int employeeCount;
	private String postalCode;
	private String tagLine;
	private BusinessService businessService;
	
	public Company() {
		System.out.println("Default constructor");
	}
	
	public Company(String companyName, int yearOfIncorporation) {		
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		System.out.println("Constructor");
	}
	
	public void initialize() {
		System.out.println("Company: Initialize method called");
	}
	
	public void destroy() {
		System.out.println("Company: Destroy mehtod called");
	}
	
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
		System.out.println("setEmployeeCount method called");
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		System.out.println("setPostalCode method called");
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
		System.out.println("setTagLine method called");
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
		System.out.println("setBusinessService method called");
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
