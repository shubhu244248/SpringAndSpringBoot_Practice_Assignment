package com.practical.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hsptl")
@Data
@PropertySource("classpath:input.properties")
public class Hospital {

	@Value("KIMS")
	private String name;

	@Value("30")
	private int age;

	@Value("${hsptl.name}")
	private String name1;

	@Value("${hsptl.age}")
	private int age1;

	@Value("${Path}")
	private String pathData;

	@Value("${os.name}")
	private String os;
	
	@Autowired
//	@Value("#{labinfo}")
	private LabTestInfo info;
	
	@Value("#{labinfo.bodyTestPrice+labinfo.rtpcrTestPrice}")    //SPEL based injection  
	private  float labTestBillAmt;
}
