package com.springcore.domain.product;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ConsumerProduct extends GenericProduct {
	@Override
	public int calculatePrice() {
		Random random = new Random();
		int price = random.nextInt(priceRandomizer);
		return price;
	}

}
