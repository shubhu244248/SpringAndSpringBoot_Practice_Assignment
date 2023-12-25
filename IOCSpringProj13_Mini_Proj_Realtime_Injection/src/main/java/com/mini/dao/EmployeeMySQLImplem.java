package com.mini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mini.bo.EmployeeBO;

public class EmployeeMySQLImplem implements IEmployeeDAO{
	
	private static final String INSERT_EMP_DETAILS = "INSERT INTO EMPLOYEE(ENAME,EDESIGNATION,EBASICPAY,EGROSSPAY,ENETPAY) VALUES(?,?,?,?,?)";
	
	private DataSource ds;

	public EmployeeMySQLImplem(DataSource ds) {
		System.out.println("EmployeeMySQLImplem. 1 Param Constructor");
		this.ds = ds;
	}
	
	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("EmployeeMySQLImplem.insertEmployee()");
		int result =  0;
		
		try( Connection conn = ds.getConnection();
				PreparedStatement ps = conn.prepareStatement(INSERT_EMP_DETAILS);
				) {
			
			ps.setString(1, bo.geteName());
			ps.setString(2, bo.geteDesignation());
			ps.setFloat(3, bo.getBasicPay());
			ps.setFloat(4, bo.getGrossPay());
			ps.setFloat(5, bo.getNetPay());
			
			result = ps.executeUpdate();
			
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
		
		return result;
	}
	
}
