package com.springcore.di.domain;

import core.springcore.di.service.RecruitmentService;

public class HumanResourceDept implements Department {
	private String deptName;
	private RecruitmentService recruitmentService;
	private Company company;

	//constructor based dependency injection
	public HumanResourceDept(RecruitmentService recruitmentService, Company company) {
		this.recruitmentService = recruitmentService;
		this.company = company;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruiteEmployees(company.getCompanyName(), deptName, numberOfRecruitments);
		return hiringFacts;
	}

}
