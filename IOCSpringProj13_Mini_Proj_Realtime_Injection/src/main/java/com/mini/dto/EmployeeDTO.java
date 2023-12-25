package com.mini.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	 
	private Integer eId;
	private String eName;
	private String eDesignation;
	private Float basicPay;
	
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
	
	
}
