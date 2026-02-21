package com.esanchez.devel.patterns.strategy;

public class BizumPayment implements PaymentStrategy {

	@Override
	public void process() {
		System.out.println("Processing BIZUM payment");
	}

}
