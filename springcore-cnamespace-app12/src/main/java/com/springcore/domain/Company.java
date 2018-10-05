package com.springcore.domain;

public class Company {
	private String companyName;
	private int yearOfIncorporation;
	private Address address;
	
	public Company(String companyName, int yearOfIncorporation, Address address) {		
		super();
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + " address=" + address + "]";
	}
}
