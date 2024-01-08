package com.practical.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empDAO")
public class EmployeeDAO {
	
	private static final String GET_EMP_COUNT = "SELECT COUNT(*) FROM EMPLOYEE";
	
	@Autowired
	private DataSource ds;
	
	public int getEmpCount() throws SQLException {
		
		Connection conn = ds.getConnection();
		
		PreparedStatement ps = conn.prepareStatement(GET_EMP_COUNT);
		
//		int count = ps.executeUpdate();
		ResultSet rs = ps.executeQuery();
		rs.next();
		int count = rs.getInt(1);
		rs.close();
		ps.close();
		conn.close();
		return count;
	}
}
