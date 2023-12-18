package com.pract.comp;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	
//	HAS a property of type Interface
	private Courier courier;

	 public Flipkart() {
		// TODO Auto-generated constructor stub
		System.out.println("Factory : 0- para constructor");
	}

//	Setter method for Setter Injection 
	public void setCourier(Courier courier) {
		System.out.println("Factory.setCourier()");
		this.courier = courier;
	}
	
//	Business logic for Shopping 
	public String shopping(String item[], float prices[]) {
		float billAmt = 0.0f;
		for(int i =0; i<item.length;i++) {
			billAmt = billAmt + prices[i];
		}
		
		int oId = new Random().nextInt(10000);
		
		String status = courier.deliver(oId);
		
		String Msg = Arrays.toString(item)+" are purches with price "+Arrays.toString(prices)+". The bill amount is "+billAmt;
		
		return Msg+" "+status;
		
	}
}
