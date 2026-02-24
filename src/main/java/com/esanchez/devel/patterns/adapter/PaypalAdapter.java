package com.esanchez.devel.patterns.adapter;

public class PaypalAdapter implements PaymentService {

	private final PaypalService paypalService;
	
	public PaypalAdapter(PaypalService paypalService) {
		this.paypalService = paypalService;
	}
	
	@Override
	public void pay() {
		paypalService.payment(); // call to the service with the incompatible method "payment"
	}
}
