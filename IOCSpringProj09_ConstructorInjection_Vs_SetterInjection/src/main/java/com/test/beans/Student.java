package com.test.beans;

public class Student {
	
	private Integer stdId;
	private String stdName;
	private String stdAge;
	private String stdClg;
	private String stdQualy;
	
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public void setStdAge(String stdAge) {
		this.stdAge = stdAge;
	}
	public void setStdClg(String stdClg) {
		this.stdClg = stdClg;
	}
	public void setStdQualy(String stdQualy) {
		this.stdQualy = stdQualy;
	}
	
	
	@Override
	public String toString() {
		return "Student Details : [stdId=" + stdId + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdClg=" + stdClg
				+ ", stdQualy=" + stdQualy + "]";
	}
}
