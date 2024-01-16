package com.practical.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hsptl")
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
}
