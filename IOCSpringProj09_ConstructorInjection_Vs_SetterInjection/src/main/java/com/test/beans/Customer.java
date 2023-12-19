package com.test.beans;

public class Customer {
	
	// maditory fields
	private Integer cusId;
	private String cusName;
	private Float cusBillAmt;
	
	// optional fields
	private String cusAdd;
	private Long cusMob;
	
	
	public Customer(Integer cusId, String cusName, Float cusBillAmt) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusBillAmt = cusBillAmt;
	}

	public void setCusAdd(String cusAdd) {
		this.cusAdd = cusAdd;
	}
	
	
	public void setCusMob(Long cusMob) {
		this.cusMob = cusMob;
	}


	@Override
	public String toString() {
		return "Cusromer Details : [cusId=" + cusId + ", cusName=" + cusName + ", cusBillAmt=" + cusBillAmt + ", cusAdd=" + cusAdd
				+ ", cusMob=" + cusMob + "]";
	}
	
	
}
