package com.practical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practical.beans.PersonInfo;

@SpringBootApplication
public class SpringBoot07YmlConnectionwithConfigurationPorpertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication
				.run(SpringBoot07YmlConnectionwithConfigurationPorpertiesApplication.class, args);
		
		PersonInfo info = ctx.getBean("perinfo", PersonInfo.class);
		
		System.out.println(info);
		
		System.out.println();
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
