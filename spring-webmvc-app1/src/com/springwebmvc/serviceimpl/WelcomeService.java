package com.springwebmvc.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.springwebmvc.service.GenericWelcomeService;

public class WelcomeService implements GenericWelcomeService {
	public List<String> getWelcomeMessage(String name){
		List<String> myWelcomeMessage = new ArrayList<>();
		myWelcomeMessage.add("Hello ");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(", Welcome to javaee project");
		return myWelcomeMessage;
	}
}
