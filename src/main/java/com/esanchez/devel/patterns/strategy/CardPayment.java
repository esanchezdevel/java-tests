package com.esanchez.devel.patterns.strategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public void process() {
		System.out.println("Processing CARD payment");
	}

}
