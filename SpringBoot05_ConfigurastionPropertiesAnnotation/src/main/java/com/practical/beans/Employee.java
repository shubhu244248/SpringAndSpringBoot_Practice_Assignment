package com.practical.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.val;

@Component("emp")
@ConfigurationProperties(prefix = "emp.details")
public class Employee {
	
	@Value("${emp.info.name}")
	private String name;
	private int age;
	
	public Employee() {
		System.out.println("Employee.0-Paramt - Employee()");
	}

	public void setName(String name) {
		System.out.println(this.name);
		this.name = name;
		System.out.println("Employee Name : "+ name);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
