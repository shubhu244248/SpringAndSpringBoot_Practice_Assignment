package com.pract.comp;

public final class DTDC implements Courier{

	public DTDC() {
		System.out.println("DTDC.DTDC()- 0 Param");
	}
	@Override
	public String deliver(int oId) {
		// TODO Auto-generated method stub
		System.out.println("DTDC.deliver()- 1 Param");
		return "Order ID: "+oId+" order is deliver by DTDC";
	}

}
