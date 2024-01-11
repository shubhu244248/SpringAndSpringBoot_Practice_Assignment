package com.practical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.practical.dao.IEmployeeDAO;
import com.practical.model.Employee;
import com.practical.service.IEmployeeManagamentService;

@Controller("controller")
public class PayrollSystemController {

	@Autowired
	private IEmployeeManagamentService service;

	public List<Employee> showEmpDetailsByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> listEmp = service.fetchEmpDetailsByDesg(desg1, desg2, desg3);

		return listEmp;
	}
}
