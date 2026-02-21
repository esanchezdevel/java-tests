package com.esanchez.devel.patterns.strategy;

import java.util.Scanner;

public class StrategyPattern {

	public static void main(String[] args) {
		System.out.println("Practice of Strategy Pattern");
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Select the payment method:");
			System.out.println("1 - Paypal");
			System.out.println("2 - Card");
			System.out.println("3 - Bizum");
			int paymentType = scanner.nextInt();
			
			processPayment(paymentType);
		} catch (Exception e) {
			System.out.println("Unexpected error. " + e.getMessage());
		}
	}

	private static void processPayment(int paymentType) throws Exception {
		PaymentStrategy payment = null;
		// In the strategy pattern, the client decide the type of Object that has to be
		// instantiated, and create an instance of that Object.
		// It's very similar to the Factory pattern, but in that case the Object creation 
		// is done in the Factory class, meanwhile in this case the Object creation is done 
		// in the "client" class.
		if (paymentType == 1)
			payment = new PaypalPayment();
		else if (paymentType == 2)
			payment = new CardPayment();
		else if (paymentType == 3)
			payment = new BizumPayment();
		else
			throw new Exception("Invalid payment type");
		
		payment.process();
	}
	
	
}
