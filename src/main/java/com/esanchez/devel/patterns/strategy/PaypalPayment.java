package com.esanchez.devel.patterns.strategy;

public class PaypalPayment implements PaymentStrategy {

	@Override
	public void process() {
		System.out.println("Processing PAYPAL payment");
	}

}
