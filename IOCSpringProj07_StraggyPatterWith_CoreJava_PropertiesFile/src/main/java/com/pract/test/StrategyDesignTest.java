package com.pract.test;

import com.pract.comp.Flipkart;
import com.pract.factory.FlipkartFactory;

public class StrategyDesignTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Flipkart flipkart = FlipkartFactory.createFlipkart();
			
			String result = flipkart.shopping(new String [] {"Shirt","Pant","Device"}, new float[] {3000.0f,500.0f,15000.0f});
			
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
