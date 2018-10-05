package com.springcore.serviceimpl;

import java.util.Random;

import com.springcore.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, "+ companyName +
				" provides an outstnding Ecommerce platform." +
				"\nThe total income exceeds "+ random.nextInt(revenue) + "dollers.";
		return service;
	}
}
