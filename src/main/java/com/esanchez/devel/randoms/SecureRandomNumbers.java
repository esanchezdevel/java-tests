package com.esanchez.devel.randoms;

import java.security.SecureRandom;
import java.util.Random;

public class SecureRandomNumbers {

	public static void main(String[] args) {
		
		Random random = new Random();
		for (int i=0; i<10; i++) {
			System.out.println("Random number: " + random.nextInt());
		}
		System.out.println("========================================");
		
		// The use of SecureRandom is recommended over Random, because the numbers generated 
		// are less predictable.
		SecureRandom secureRandom = new SecureRandom();
		for (int i=0; i<10; i++) {
			System.out.println("Secure Random number: " + secureRandom.nextInt());
		}
	}
}
