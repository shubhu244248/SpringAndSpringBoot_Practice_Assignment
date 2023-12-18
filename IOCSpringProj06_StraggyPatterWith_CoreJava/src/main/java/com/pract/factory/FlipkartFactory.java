package com.pract.factory;

import com.pract.comp.BlueDart;
import com.pract.comp.Courier;
import com.pract.comp.DTDC;
import com.pract.comp.Flipkart;

public class FlipkartFactory {

	public static Flipkart createFlipkart(String courierType) {
		Flipkart flipkart = new Flipkart();
		Courier courier = null;
		
		if(courierType.equalsIgnoreCase("DTDC")) {
			courier = new DTDC();
		} else if (courierType.equalsIgnoreCase("BlueDart")) {
			courier = new BlueDart();
		} else {
			throw new IllegalArgumentException("Invalid Courier Type");
		}
		flipkart.setCourier(courier);
		return flipkart;
	}
}
