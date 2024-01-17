package com.practical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.practical.beans.PersonInfo;

@SpringBootApplication
public class SpringBoot06ConfigurastionPropertiesAnnotationOnArrayCollectionAndHasATyepePropertyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SpringBoot06ConfigurastionPropertiesAnnotationOnArrayCollectionAndHasATyepePropertyApplication.class, args);
		
		PersonInfo info = ctx.getBean("perinfo", PersonInfo.class);
		
		System.out.println();
		System.out.println(info);
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
