package com.test.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.test.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		
		// Hld spring bean cfg file name and location 
		FileSystemResource res = new FileSystemResource("src/main/java/com/test/cnfg/applicationnContext.xml");
		
		// create IOC container (BeanFactory container)
		XmlBeanFactory fact = new XmlBeanFactory(res);
		
		// get Target spring bean class object
		Object obj = fact.getBean("wmg");
		
		// type casting 
		WishMessageGenerator gen = (WishMessageGenerator) obj;
		
		// invoke the generator method
		String result = gen.generateMessage("Shubham");
		System.out.println("Wish Message : " + result);
	}
}
