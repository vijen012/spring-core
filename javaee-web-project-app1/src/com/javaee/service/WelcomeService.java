package com.javaee.service;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {
	public List<String> getWelcomeMessage(String name){
		List<String> myWelcomeMessage = new ArrayList<>();
		myWelcomeMessage.add("Hello ");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(", Welcome to javaee project");
		return myWelcomeMessage;
	}
}
