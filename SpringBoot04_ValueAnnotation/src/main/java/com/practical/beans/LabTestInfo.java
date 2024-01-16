package com.practical.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("labinfo")
@Data
public class LabTestInfo {
	
	@Value("1400.00")
	private float bloodTestPrice;
	
	@Value("1500.00")
	private float rtpcrTestPrice;
	
	@Value("${labinfo.bodyTestPrice}")
	private float bodyTestPrice;
}
