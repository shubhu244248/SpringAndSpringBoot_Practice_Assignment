package com.test.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethodTest2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, Exception {
		// TODO Auto-generated method stub

		Class c1 = Class.forName(args[0]);
		
		Constructor cons[] = c1.getDeclaredConstructors();
		
		Object obj1 = cons[0].newInstance();
		
		System.out.println(obj1);
		System.out.println("________________");
		
		Object obj2 = cons[1].newInstance(100,"Shubham");
		System.out.println(obj2);
	
	}
}
