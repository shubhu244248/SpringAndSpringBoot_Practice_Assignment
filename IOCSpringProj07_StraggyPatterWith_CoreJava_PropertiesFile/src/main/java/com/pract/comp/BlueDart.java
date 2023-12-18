package com.pract.comp;

public class BlueDart implements Courier{

	public BlueDart() {
		System.out.println("BlueDart.BlueDart()- 0 Param");
	}
	
	@Override
	public String deliver(int oId) {
		// TODO Auto-generated method stub
		System.out.println("BlueDart.deliver()- 1 Param");
		return "Order ID:"+oId+" order is delivered by Blue Dart.";
	}
	
}
