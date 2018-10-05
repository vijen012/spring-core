package com.springcore.serviceimpl;

import java.util.Random;

import com.springcore.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName +
				" offer world class Could Computing infrastructure."+
				"\nThe total income exceeds "+ random.nextInt(revenue) + " dollers.";
		return service;
	}
	
	public void initialize() {
		System.out.println("CloudServiceImpl: Initialize method called");
	}
	
	public void destroy() {
		System.out.println("CloudServiceImpl: Destroy mehtod called");
	}
}
