package com.springcore.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.springcore.service.BusinessService;

@Component("company")
public class Company {
	
	@Value("${nameOfCompany}")
	private String companyName;
	
	@Value("${startUpYear}")
	private int yearOfIncorporation;
	
	@Value("${empCount:3000}") // if property doesn't found in property file then 3000 is default value
	private int employeeCount;
	
	@Value("${postalCode}")
	private String postalCode;
	
	@Value("${corporateSlogan: We build world class software !}")
	private String tagLine;
	
	private String missionStatement; //see companyTagLine  method
	
	//Environment is a spring interface which provides getters mehtod to access all the properties
	@Autowired
	private Environment env; //see companyTagLine method
	
	private BusinessService businessService;
	
	public Company() {
		System.out.println("Default constructor");
	}
	
	public Company(String companyName, int yearOfIncorporation) {		
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		System.out.println("Constructor");
	}
	
	public void postConstruct() {
		System.out.println("Company: postConstruct method called");
	}
	
	public void preDestroy() {
		System.out.println("Company: preDestroy mehtod called");
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
		missionStatement = env.getProperty("statement");
		return missionStatement + " and also " + tagLine;
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
