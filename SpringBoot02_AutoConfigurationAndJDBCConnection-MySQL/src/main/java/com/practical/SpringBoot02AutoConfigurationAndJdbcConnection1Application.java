package com.practical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practical.dao.EmployeeDAO;

@SpringBootApplication
public class SpringBoot02AutoConfigurationAndJdbcConnection1Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx= SpringApplication.run(SpringBoot02AutoConfigurationAndJdbcConnection1Application.class, args);
		
		EmployeeDAO dao = ctx.getBean("empDAO", EmployeeDAO.class);
		
		System.out.println("Employee Count :"+ dao.getEmpCount());
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
