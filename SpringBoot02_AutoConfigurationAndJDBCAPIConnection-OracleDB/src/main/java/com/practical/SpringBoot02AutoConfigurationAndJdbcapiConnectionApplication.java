package com.practical;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practical.dao.EmployeeDAO;

@SpringBootApplication
public class SpringBoot02AutoConfigurationAndJdbcapiConnectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication
				.run(SpringBoot02AutoConfigurationAndJdbcapiConnectionApplication.class, args);

		EmployeeDAO dao = ctx.getBean("empDAO", EmployeeDAO.class);

		try {
			System.out.println("Employee Count :" + dao.getEmpCount());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		((ConfigurableApplicationContext) ctx).close();
	}

}
