package com.practical.service;

import java.util.List;

import com.practical.model.Employee;

public interface IEmployeeManagamentService {

	public List<Employee> fetchEmpDetailsByDesg(String desg1, String desg2, String desg3)throws Exception;
}
