package com.practical.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("perinfo")
@ConfigurationProperties(prefix = "per.info")
@Data
public class PersonInfo {
	
	private Integer perId;
	private String perName;
	private String[] favColour;
	private List<String> studies;
	private Set<Long> phoneNum;
	private Map<String, Object> idDetails;
	private JobDetails jobDetails; /*HAS-A PRoperty*/
	
}
