package com.test.beans;

public class Employee {
	
	private Integer empId;
	private String  empName;
	private String empDeg;
	private Float empSal;
	
	
	public Employee(Integer empId, String empName, String empDeg, Float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDeg = empDeg;
		this.empSal = empSal;
	}


	@Override
	public String toString() {
		return "Employee Details : [empId=" + empId + ", empName=" + empName + ", empDeg=" + empDeg + ", empSal=" + empSal + "]";
	}
}
