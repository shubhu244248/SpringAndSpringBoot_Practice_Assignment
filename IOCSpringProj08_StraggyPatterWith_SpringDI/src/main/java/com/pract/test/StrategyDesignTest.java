package com.pract.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.pract.comp.Flipkart;

public class StrategyDesignTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try {
			Flipkart flipkart = FlipkartFactory.createFlipkart();
			
			String result = flipkart.shopping(new String [] {"Shirt","Pant","Device"}, new float[] {3000.0f,500.0f,15000.0f});
			
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}*/
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/pract/cnfg/applicationContext.xml");
		
		Flipkart fpkt = factory.getBean("fpkt",Flipkart.class);
		
		String result = fpkt.shopping(new String [] {"Shirt","Shoes"}, new float[] {5000.0f,1000.0f});
		
		System.out.println(result);
		
		
	}

}
