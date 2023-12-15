package com.test.beans;

import java.util.Date;

public class WishMessageGenerator {

//	HAS-A property (Supporting Composition)
	private Date date;

//	public WishMessageGenerator() {
//		System.out.println("0:Param constructor");
//	}
	/*
	 * // setter method for Setter injetioon public void setDate(Date date) {
	 * System.out.println("Set Date"); this.date = date; }
	 */
	// Costructor for the Injection
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator : 1 Param Constructor)");
		this.date = date;
	}

	// msg generator method
	public String generateMessage(String user) {
		System.out.println("Generate Wish Messages ");
		int hr = date.getHours();

		if (hr < 12) {
			return "Good Morning " + user;
		} else if (hr < 16) {
			return "Good Afternoon " + user;
		} else if (hr < 20) {
			return "Good Evening " + user;
		} else {
			return "Good Night " + user;
		}
	}


}
