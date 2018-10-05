package com.springwebscope.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springwebscope.service.RandomizerRequestScope;
import com.springwebscope.service.RandomizerSessionScope;

@Controller
public class ScopeController {
	
	@Autowired
	RandomizerRequestScope randomizerRequestScope;
	
	@Autowired
	RandomizerSessionScope randomizerSessionScope;
	
	@RequestMapping("/")
	public void getRandom(HttpServletResponse response) throws Exception {
		response.getWriter().write("*************************** Request Scope ************************* <br>");
		response.getWriter().write("Old Number: " + randomizerRequestScope.getRandomNumber() + "<br>");
		randomizerRequestScope.generateRandomNumber();
		response.getWriter().write("New Number: " + randomizerRequestScope.getRandomNumber() + "<br>");
		response.getWriter().write("Object References: " + randomizerRequestScope + "<br>");
		
		response.getWriter().write("*************************** Session Scope ************************* <br>");
		response.getWriter().write("Old Number: " + randomizerSessionScope.getRandomNumber() + "<br>");
		randomizerSessionScope.generateRandomNumber();
		response.getWriter().write("New Number: " + randomizerSessionScope.getRandomNumber() + "<br>");
		response.getWriter().write("Object References: " + randomizerSessionScope + "<br>");
		
	}
}
