package com.test.comp;

public class Test {

	private int a = 10;
	private String b = "Shubham";
	
	public Test() {
		System.out.println("Test : 0 Param constructor");
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}	
}
