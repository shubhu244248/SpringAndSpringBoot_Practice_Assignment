package com.practical;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practical.controller.PayrollSystemController;
import com.practical.model.Employee;

@SpringBootApplication
public class SpringBoot03MiniProjecctLayeredApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringBoot03MiniProjecctLayeredApplication.class, args);

		PayrollSystemController controller = ctx.getBean("controller", PayrollSystemController.class);

		Scanner sc = new Scanner(System.in);
		System.out.println("Desg 1: ");
		String desg1 = sc.next().toUpperCase();
		System.out.println("Desg 2: ");
		String desg2 = sc.next().toUpperCase();
		System.out.println("Desg 3: ");
		String desg3 = sc.next().toUpperCase();

		try {
			List<Employee> listEmps = controller.showEmpDetailsByDesg(desg1, desg2, desg3);
			for (Employee employee : listEmps) {
				System.out.println(employee);
			}

		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		((ConfigurableApplicationContext) ctx).close();
	}

}
