package com.mini.proj;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mini.controller.MainController;
import com.mini.vo.EmployeeVO;

public class App {
	public static void main(String[] args) {
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/mini/cnfg/applicationContext.xml");
		// get SpringBean class obj ref
		MainController controller = factory.getBean("controller", MainController.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name::");
		String name = sc.nextLine();
		System.out.println("Enter Employee Designation::");
		sc.next();
		String desg = sc.nextLine();
		System.out.println("Enter Employee Basic Salary::");
		String basicSalary = sc.next();
		
		
		EmployeeVO vo = new EmployeeVO();
		vo.seteName(name);
		vo.seteDesignation(desg);
		vo.setBasicPay(basicSalary);
		
		
		try {
			String result = controller.processEmployee(vo);
			System.out.println(result);
		} catch (Exception e) {
			 e.printStackTrace();
			System.out.println("Internal problem::" + e.getMessage());
		}
	}
}
