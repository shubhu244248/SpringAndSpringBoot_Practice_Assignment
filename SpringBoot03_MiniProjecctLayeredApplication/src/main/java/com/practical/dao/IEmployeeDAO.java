package com.practical.dao;

import java.util.List;

import com.practical.model.Employee;

public interface IEmployeeDAO {
	public abstract  List<Employee> getEmpByDesg(String desg1, String desg2, String desg3) throws Exception;
}
