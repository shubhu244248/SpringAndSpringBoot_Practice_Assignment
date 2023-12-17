package com.spring.comp;

public class SportsCars extends Car {

	private String regNo;
	
	public SportsCars(String regNo) {
		System.out.println("LuxeryCar.LuxeryCar()");
		this.regNo = regNo;
	}
	@Override
	public void drive() {
		System.out.println("Driving Sport Car");
	}
	
}
