package com.practical.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	public Integer empNo;
	public String empName;
	public String job;
	public Float sal;
}
