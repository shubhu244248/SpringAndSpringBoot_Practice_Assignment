package com.spring.comp;

public class LuxeryCar extends Car {
	private String regNo;
	
	
	public LuxeryCar(String regNo) {
		System.out.println("LuxeryCar.LuxeryCar()");
		this.regNo = regNo;
	}


	@Override
	public void drive() {
		System.out.println("Driving Luxery Car");
	}
	
}
