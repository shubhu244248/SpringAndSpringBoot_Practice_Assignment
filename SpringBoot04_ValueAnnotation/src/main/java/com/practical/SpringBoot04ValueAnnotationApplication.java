package com.practical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practical.beans.Hospital;

@SpringBootApplication
public class SpringBoot04ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBoot04ValueAnnotationApplication.class, args);

		Hospital hospital = ctx.getBean("hsptl", Hospital.class);

		System.out.println("Spring Bean class object data");
		System.out.println(hospital);

		System.out.println("System Prperties");
		System.out.println(System.getProperties());

		System.out.println();
		
		((ConfigurableApplicationContext) ctx).close();

	}

}                                                                     
