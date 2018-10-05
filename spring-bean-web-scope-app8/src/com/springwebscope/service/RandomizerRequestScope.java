package com.springwebscope.service;

public class RandomizerRequestScope {
	private int randomNumber = 5;
	
	public int getRandomNumber(){
		return this.randomNumber;
	}
	
	public void generateRandomNumber(){
		this.randomNumber = (int) (Math.random() * 99999);
	}
}
