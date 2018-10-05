package com.springcore.di.serviceimpl;

import java.util.Random;

import core.springcore.di.service.RecruitmentService;

public class ReferralRecruitmentServiceImpl implements RecruitmentService {

	public String recruiteEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + "hired " +
		random.nextInt(numberOfRecruitments) + " employees " + 
				"which were referred to the company by employees";
		return hiringFacts;
	}

}
