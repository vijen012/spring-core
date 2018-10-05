package com.springcore.di.serviceimpl;

import java.util.Random;

import core.springcore.di.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName +
				" offer world class Could Computing infrastructure."+
				"\nThe total income exceeds "+ random.nextInt(revenue) + " dollers.";
		return service;
	}
}
