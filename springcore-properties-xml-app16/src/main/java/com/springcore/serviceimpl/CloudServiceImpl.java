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
	
	public void postConstruct() {
		System.out.println("CloudServiceImpl: postConstruct method called");
	}
	
	public void preDestroy() {
		System.out.println("CloudServiceImpl: preDestroy mehtod called");
	}
}
