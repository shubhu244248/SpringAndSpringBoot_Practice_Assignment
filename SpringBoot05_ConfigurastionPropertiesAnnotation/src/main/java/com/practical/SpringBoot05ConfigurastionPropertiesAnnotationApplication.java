package com.practical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practical.beans.Employee;

@SpringBootApplication
public class SpringBoot05ConfigurastionPropertiesAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBoot05ConfigurastionPropertiesAnnotationApplication.class,
				args);
		
		Employee employee = ctx.getBean("emp", Employee.class);
		
		System.out.println("Employee Details");
		System.out.println(employee);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
