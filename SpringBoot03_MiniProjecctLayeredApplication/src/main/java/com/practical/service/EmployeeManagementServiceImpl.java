package com.practical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practical.dao.IEmployeeDAO;
import com.practical.model.Employee;

@Service("empService")
public class EmployeeManagementServiceImpl implements IEmployeeDAO {

	@Autowired
	private IEmployeeDAO dao;
	
	
	@Override
	public List<Employee> getEmpByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> listEmp = dao.getEmpByDesg(desg1, desg2, desg3);
		
		return listEmp;
	}

}
