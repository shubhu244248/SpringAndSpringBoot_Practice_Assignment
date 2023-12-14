package com.test.test;

public class NewInstanceMethodTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		Class c1 = Class.forName(args[0]);
		Class c2 = Class.forName(args[1]);	
		
		Object obj1 = c1.newInstance();
		Object obj2 = c2.newInstance();
	
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}
