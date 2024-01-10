package com.practical.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private Integer emoNo;
	private String empName;
	private String job;
	private Float sal;
}
