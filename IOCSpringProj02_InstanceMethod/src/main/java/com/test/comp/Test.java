package com.test.comp;

public class Test {

	private int a = 10;
	private String b = "Shubham";
	
	public Test() {
		System.out.println("Test : 0 Param constructor");
	}
	

	public Test(int a, String b) {
		System.out.println("Test : 2 Param constructor");
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}	
}
