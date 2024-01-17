package com.practical.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("custinfo")
@ConfigurationProperties(prefix = "cust.info")
@Data
public class CustomerInfo {
	
	private String name;
	private int age;
	private String add;
	private float billAmt;
	
}
