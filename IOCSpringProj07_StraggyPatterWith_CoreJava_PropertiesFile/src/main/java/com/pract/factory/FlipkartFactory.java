package com.pract.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.pract.comp.BlueDart;
import com.pract.comp.Courier;
import com.pract.comp.DTDC;
import com.pract.comp.Flipkart;

public class FlipkartFactory {

//	public static Flipkart createFlipkart(String courierType) {
//		Flipkart flipkart = new Flipkart();
//		Courier courier = null;
//		
//		if(courierType.equalsIgnoreCase("DTDC")) {
//			courier = new DTDC();
//		} else if (courierType.equalsIgnoreCase("BlueDart")) {
//			courier = new BlueDart();
//		} else {
//			throw new IllegalArgumentException("Invalid Courier Type");
//		}
//		flipkart.setCourier(courier);
//		return flipkart;
//	}
	
	private static Properties props;
	
	static {
		System.out.println("FlipkartFactory : Static Block");
	
		try {
			FileInputStream fInStream = new FileInputStream("src/main/java/com/pract/commons/info.properties");
			
			props = new Properties();
			props.load(fInStream);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static Flipkart createFlipkart() throws Exception{
		
		Flipkart fpkt = new Flipkart();
		
		Class c = Class.forName(props.getProperty("dependent.comp"));
		
		Constructor cons[] = c.getDeclaredConstructors();
		
		Courier courier = (Courier) cons[0].newInstance();
		
		fpkt.setCourier(courier);
		
		return fpkt;
		
	}
}
