package com.pract.test;

import com.pract.singleton.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p1 = Printer.getPrinter();
		Printer p2 = Printer.getPrinter();
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("_____________________________");
		System.out.println("p1==p2 :: "+ (p1==p2));
	}

}
