package com.practical.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practical.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {

	private static final String GET_EMP_BY_DESG = " SELECT EMPNO, ENAME, JOB, SAL FROM EMP WHERE JOB (?,?,?) ORDER BY JOB";

	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmpByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> listEmp = new ArrayList<Employee>();
		try (Connection conn = ds.getConnection(); PreparedStatement ps = conn.prepareStatement(GET_EMP_BY_DESG)) {

			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEmpNo(rs.getInt(1));
					emp.setEmpName(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getFloat(4));
				}
			}

		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
			throw se;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}

		return listEmp;

	}

}
