package com.practical.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@ConfigurationProperties(prefix = "emp.details")
@Data
public class Employee {
	
	private String name;
	private int age;
	
}
