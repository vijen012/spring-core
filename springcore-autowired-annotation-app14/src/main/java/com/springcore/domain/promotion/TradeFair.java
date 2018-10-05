package com.springcore.domain.promotion;

import org.springframework.beans.factory.annotation.Autowired;

import com.springcore.domain.product.ConsumerProduct;
import com.springcore.domain.product.IndustrialProduct;

public class TradeFair {
	
	/*
	 * We can do autowiring using 3 types:-
	 * 1. Constructor
	 * 2. Setters
	 * 3. Instance Fields
	 */
	
	//3. Autowiring using fields
	@Autowired
	private IndustrialProduct industrialProduct;
	
	@Autowired
	private ConsumerProduct consumerProduct;
	
//	public TradeFair() {
//		// TODO Auto-generated constructor stub
//	}
	
	/*1. Autowiring using constructor - if bean class has one constructor then in spring 4.3 it's not mandatory to add 
	 * @Autowired annotation but if it has more than one constructor then we have to add @Autowired annotation so it instruct
	 * container to use @Autowired constructor to create object		
	*/
/*	@Autowired
	public TradeFair(IndustrialProduct industrialProduct, ConsumerProduct consumerProduct) {
		super();
		this.industrialProduct = industrialProduct;
		this.consumerProduct = consumerProduct;
	}*/

	//2. Autowiring using setters
/*	@Autowired
	public void setIndustrialProduct(IndustrialProduct industrialProduct) {
		this.industrialProduct = industrialProduct;
	}

	@Autowired
	public void setConsumerProduct(ConsumerProduct consumerProduct) {
		this.consumerProduct = consumerProduct;
	}*/

	public int declareIndustrialProductPrice(IndustrialProduct industrialProduct) {
		return industrialProduct.calculatePrice();
	}
	
	public int declareConsumerProductPrice(ConsumerProduct consumerProduct) {
		return consumerProduct.calculatePrice();
	}
	
	public String specialPromotionalPricing() {
		String priceInfo = "Industrial Product priced at $" + declareIndustrialProductPrice(industrialProduct) + " and "+
							"Consumer Product priced at $" + declareConsumerProductPrice(consumerProduct);
		return priceInfo;
	}
}
