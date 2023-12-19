package com.test.test;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.test.beans.Customer;
import com.test.beans.Employee;
import com.test.beans.Student;

public class Constructor_Setter_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create IOC Container 
		DefaultListableBeanFactory fact = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(fact);
		read.loadBeanDefinitions("com/test/cnfg/applicationContext.xml");
		
		// get Spring Bean obj from xml file
		
		Employee emp1 = fact.getBean("emp1",Employee.class);
		System.out.println(emp1);
		System.out.println("------------------------------");
		Employee emp2 = fact.getBean("emp2",Employee.class);
		System.out.println(emp1);
		System.out.println("------------------------------");
		
		Customer cus1 = fact.getBean("cus1",Customer.class);
		System.out.println(cus1);
		System.out.println("------------------------------");
		Customer cus2 = fact.getBean("cus1",Customer.class);
		System.out.println(cus2);
		System.out.println("------------------------------");
		
		Student std1 = fact.getBean("std1",Student.class);
		System.out.println(std1);
		System.out.println("------------------------------");
		Student std2 = fact.getBean("std2",Student.class);
		System.out.println(std2);
		System.out.println("------------------------------");
	}

}
