package com.mini.controller;

import com.mini.dto.EmployeeDTO;
import com.mini.service.IEmployeeMangService;
import com.mini.vo.EmployeeVO;

public class MainController {
	private IEmployeeMangService service;

	public MainController(IEmployeeMangService service) {
		System.out.println("MainController.MainController()");
		this.service = service;
	}
	
	
	public String processEmployee (EmployeeVO vo) throws Exception{
		EmployeeDTO dto = new EmployeeDTO();
		
		dto.seteName(vo.geteName());;
		dto.seteDesignation(vo.geteDesignation());
		dto.setBasicPay(Float.parseFloat(vo.getBasicPay()));
		
		String result = service.registerEmployee(dto);
		
		return result;
	}
	
}
