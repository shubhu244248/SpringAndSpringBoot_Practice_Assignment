package com.mini.bo;

public class EmployeeBO {

	private Integer eId;  
	private String eName;
	private String eDesignation;
	private Float basicPay;
	private Float grossPay;
	private Float netPay;
 

	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDesignation() {
		return eDesignation;
	}
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}
	public Float getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(Float basicPay) {
		this.basicPay = basicPay;
	}
	public Float getGrossPay() {
		return grossPay;
	}
	public void setGrossPay(Float grossPay) {
		this.grossPay = grossPay;
	}
	public Float getNetPay() {
		return netPay;
	}
	public void setNetPay(Float netPay) {
		this.netPay = netPay;
	}
}
