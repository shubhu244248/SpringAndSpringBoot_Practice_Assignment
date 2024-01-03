package com.pract.singleton;

public class Printer {

	private static Printer INSTANCE; // static variable holds reference of signle obj
	
	// private 0- param constructor
	private Printer() {
		System.out.println("Printer.");
	}

	// static factory method
	public static Printer getPrinter() {

		// singleton logic
		if (INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}
	
	
	public void print(String msg) {
		System.out.println(msg);
	}
}
