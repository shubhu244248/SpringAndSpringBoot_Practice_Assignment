package com.mini.service;

import com.mini.bo.EmployeeBO;
import com.mini.dao.IEmployeeDAO;
import com.mini.dto.EmployeeDTO;

public class EmployeeMangServiceImplem implements IEmployeeMangService{

	private IEmployeeDAO dao;

	public EmployeeMangServiceImplem(IEmployeeDAO dao) {
		System.out.println("EmployeeMangServiceImplem : 1 Param Constructor");
		this.dao = dao;
	}
	
	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("EmployeeMangServiceImplem.registerEmployee()");
		
		Float grossPay = dto.getBasicPay()+dto.getBasicPay()*0.4f;
		Float netPay = grossPay - dto.getBasicPay() * 0.2f;
		
		EmployeeBO bo = new EmployeeBO();
		
		bo.seteName(dto.geteName());
		bo.seteDesignation(dto.geteDesignation());
		bo.setBasicPay(dto.getBasicPay());
		bo.setGrossPay(grossPay);
		bo.setNetPay(netPay);
		
		int count = dao.insertEmployee(bo);
		
		return count==1?"Employee registered with Net Salary : "+netPay:"Employee not registered with netSalary::"+netPay;
	}
}
