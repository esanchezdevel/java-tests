package com.esanchez.devel.patterns.adapter;

/**
 * This pattern is used to call to methods that are incompatible with the interface that we need to use.
 * For instance in this example we have a PaypalService with the method "payment", but our interface has the method "pay"
 * Then we create the adapter class PaypalAdapter with the method "pay" and in that method we call to the "payment" method.
 */
public class AdapterPattern {

	public static void main(String[] args) {
		
		PaymentService paymentService = new PaypalAdapter(new PaypalService());
		paymentService.pay();
	}
}
