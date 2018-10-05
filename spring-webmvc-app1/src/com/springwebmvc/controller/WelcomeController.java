package com.springwebmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springwebmvc.service.GenericWelcomeService;
import com.springwebmvc.serviceimpl.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping("/") //http://localhost:7070/spring-webmvc-app1/
	public String doWelcome(Model model){
		
		//Retrieving the process data 
//		 WelcomeService welcomeService = new WelcomeService();
		 List<String> welcomeMessage = welcomeService.getWelcomeMessage("John");
		 
		 //Add data to the model
		 model.addAttribute("myWelcomeMessage", welcomeMessage);
		 
		 //Return logical view name
		return "welcomeNew"; // /WEB-INF/views/welcomeNew.jsp
	}
}
